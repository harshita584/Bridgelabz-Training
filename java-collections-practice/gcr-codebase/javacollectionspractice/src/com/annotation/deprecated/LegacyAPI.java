package com.annotation.deprecated;

public class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("This is the OLD feature (Deprecated).");
    }

    public void newFeature() {
        System.out.println("This is the NEW and recommended feature.");
    }
}
