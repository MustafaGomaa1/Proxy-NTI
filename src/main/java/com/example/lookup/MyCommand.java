package com.example.lookup;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyCommand implements Command {
    @Override
    public Object execute() {
        System.out.println("Executing " + this + " (a fresh instance each time)");
        return "done";
    }
}
