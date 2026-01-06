package com.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {

    static class PetrolPump {
        int petrol;
        int distance;

        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    public static int findStartingPoint(PetrolPump[] pumps) {

        Queue<Integer> queue = new LinkedList<>();
        int surplus = 0;
        int start = 0;

        for (int i = 0; i < pumps.length; i++) {

            surplus += pumps[i].petrol - pumps[i].distance;
            queue.offer(i);

            // If surplus is negative, remove pumps from front
            while (surplus < 0 && !queue.isEmpty()) {
                int removed = queue.poll();
                surplus -= pumps[removed].petrol - pumps[removed].distance;
                start = removed + 1;
            }
        }

        return queue.size() == pumps.length ? start : -1;
    }

    // Main method
    public static void main(String[] args) {

        PetrolPump[] pumps = {
            new PetrolPump(6, 4),
            new PetrolPump(3, 6),
            new PetrolPump(7, 3)
        };

        int startIndex = findStartingPoint(pumps);

        if (startIndex == -1)
            System.out.println("No possible circular tour");
        else
            System.out.println("Start at petrol pump index: " + startIndex);
    }
}

