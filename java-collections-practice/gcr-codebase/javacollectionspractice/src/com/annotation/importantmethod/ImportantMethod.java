package com.annotation.importantmethod;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)     // Reflection ke liye
@Target(ElementType.METHOD)              // Sirf methods pe lagegi
public @interface ImportantMethod {

    String level() default "HIGH";       // optional parameter
}
