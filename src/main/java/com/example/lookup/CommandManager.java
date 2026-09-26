package com.example.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

// Demonstrates: @Lookup
// CommandManager itself is a SINGLETON, but createCommand() must return a
// FRESH MyCommand (prototype) every time it's called. Normal field/constructor
// injection can't do this - it would only ever inject one instance, once.
// @Lookup solves this: Spring generates a CGLIB subclass overriding this
// method to fetch a new bean from the container on every invocation.
@Component
public abstract class CommandManager {

    public Object process() {
        Command command = createCommand();
        return command.execute();
    }

    @Lookup // bean name resolved by return type (Command -> MyCommand) since none is given
    protected abstract Command createCommand();
}
