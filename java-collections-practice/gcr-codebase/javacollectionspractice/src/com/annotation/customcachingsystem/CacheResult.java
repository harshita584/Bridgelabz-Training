package com.annotation.customcachingsystem;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)   // reflection ke liye
@Target(ElementType.METHOD)            // method pe lagegi
public @interface CacheResult {
}
