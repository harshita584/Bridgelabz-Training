package com.annotation.customserialization;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)  // Reflection ke liye
@Target(ElementType.FIELD)             // Field pe lagegi
public @interface JsonField {
    String name();                     // Custom JSON key
}
