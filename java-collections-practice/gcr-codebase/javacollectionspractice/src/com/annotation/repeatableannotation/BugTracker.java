package com.annotation.repeatableannotation;

public class BugTracker {

    @BugReport(description = "Null pointer issue")
    @BugReport(description = "Performance problem")
    public void processData() {
        System.out.println("Processing data...");
    }
}
