package com.annotation.repeatableannotation;

import java.lang.reflect.Method;

public class TestBugReport {

    public static void main(String[] args) throws Exception {

        Method method = BugTracker.class.getMethod("processData");

        BugReport[] reports = method.getAnnotationsByType(BugReport.class);

        for (BugReport report : reports) {
            System.out.println("Bug: " + report.description());
        }
    }
}
