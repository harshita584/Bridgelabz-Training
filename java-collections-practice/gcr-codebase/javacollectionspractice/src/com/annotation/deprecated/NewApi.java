package com.annotation.deprecated;

public class NewApi {

    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();

        api.oldFeature();   //  Deprecated warning
        api.newFeature();   //  Correct way
    }
}
