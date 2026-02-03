package com.lambdaexpression.smarthomelighting;

public class SmartHomeLighting {
    public static void main(String[] args) {
        LightAction motion = () -> System.out.println("Light for motion");
        LightAction night = () -> System.out.println("Light for night");
        LightAction voice = () -> System.out.println("Light by voice");

        motion.activate();
        night.activate();
        voice.activate();
    }
}
