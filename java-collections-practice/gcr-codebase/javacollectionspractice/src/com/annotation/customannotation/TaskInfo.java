package com.annotation.customannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME) // Needed for Reflection
@Target(ElementType.METHOD)          // Can be used on methods
public @interface TaskInfo {

    int priority();
    String assignedTo();
}
