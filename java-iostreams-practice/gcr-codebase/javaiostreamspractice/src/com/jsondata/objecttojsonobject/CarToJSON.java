package com.jsondata.objecttojsonobject;

import org.json.JSONObject;

public class CarToJSON {
    public static void main(String[] args) {
        Car car = new Car("car1", 2022, "color1");

        JSONObject json = new JSONObject();
        json.put("model", car.model);
        json.put("year", car.year);
        json.put("color", car.color);

        System.out.println(json.toString());
    }
}
