package com.annotation.rolebasedaccess;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)  // read at runtime
@Target(ElementType.TYPE)             // class-level annotation
public @interface RoleAllowed {
    String value();   // allowed role
}