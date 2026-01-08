package com.parkease;

import java.util.ArrayList;
import java.util.List;

public class ParkingManager {
    private List<String> bookingLogs = new ArrayList<>();

    public void logBooking(String message) {
        bookingLogs.add(message);
    }

    public void showLogs() {
        for (String log : bookingLogs) {
            System.out.println(log);
        }
    }
}

