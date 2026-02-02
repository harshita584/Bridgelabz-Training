package com.travellog;

import java.io.Serializable;

public class Trip implements Serializable {
    private String city;
    private String country;
    private int days;
    private String description;

    public Trip(String city, String country, int days, String description) {
        this.city = city;
        this.country = country;
        this.days = days;
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getDurationDays() {
        return days;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return city + " " + country + " " + days + " " + description;
    }
}
