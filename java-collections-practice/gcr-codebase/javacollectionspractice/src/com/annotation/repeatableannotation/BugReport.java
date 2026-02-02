package com.annotation.repeatableannotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Repeatable(BugReports.class)  
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BugReport {
    String description();
}
