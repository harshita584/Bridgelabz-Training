package com.healthcheckpro;

public class LabController {
    @PublicAPI(description = "Get all lab tests")
    public void getLabTests() {
    }

    @PublicAPI(description = "Book a lab test")
    @RequiresAuth
    public void bookLabTest() {
    }

    public void helperMethod() {
    }
}

