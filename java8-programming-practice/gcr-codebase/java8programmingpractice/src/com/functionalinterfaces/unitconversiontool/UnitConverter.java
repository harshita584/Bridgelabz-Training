package com.functionalinterfaces.unitconversiontool;

public interface UnitConverter {
    static double kmToMiles(double km) {
        return km * 0.6213;
    }

    static double kgToLbs(double kg) {
        return kg * 2.2046;
    }
}
