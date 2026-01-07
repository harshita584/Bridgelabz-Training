package com.linearandbinarysearch;

public class CompareStringBufferAndStringBuilder {

    public static void main(String[] args) {

        int n = 1000000; // 1 million times

        // StringBuffer test
        StringBuffer sbuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sbuffer.append("hello");
        }

        long endTimeBuffer = System.nanoTime();
        long bufferTime = endTimeBuffer - startTimeBuffer;

        // StringBuilder test
        StringBuilder sbuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sbuilder.append("hello");
        }

        long endTimeBuilder = System.nanoTime();
        long builderTime = endTimeBuilder - startTimeBuilder;

        // display results
        System.out.println("Time taken by StringBuffer: " + bufferTime + " ns");
        System.out.println("Time taken by StringBuilder: " + builderTime + " ns");
    }
}
