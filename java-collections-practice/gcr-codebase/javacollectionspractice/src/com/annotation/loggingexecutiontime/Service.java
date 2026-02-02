package com.annotation.loggingexecutiontime;

public class Service {

    @LogExecutionTime
    public void fastMethod() {
        for (int i = 0; i < 1000; i++) {
            // fast task
        }
    }

    @LogExecutionTime
    public void slowMethod() {
        for (int i = 0; i < 1_000_000; i++) {
            // slow task
        }
    }
}
