package com.annotation.loggingexecutiontime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)   // runtime pe read karni hai
@Target(ElementType.METHOD)            // method pe lagegi
public @interface LogExecutionTime {
}
