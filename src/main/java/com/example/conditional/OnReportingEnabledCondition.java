package com.example.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

// A custom condition: true only if the system property "feature.reporting.enabled"
// equals "true". This is the kind of class you pass to @Conditional(...).
public class OnReportingEnabledCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return "true".equals(System.getProperty("feature.reporting.enabled"));
    }
}
