package birdSantuary;

import java.util.*;

public class Sanctuary {
    private ArrayList<Bird> birds;

    public Sanctuary() {
        birds = new ArrayList<>();
    }

    public void addBird(Bird b) {
        birds.add(b);
    }

    public void displayAll() {
        for(Bird b : birds) {
            b.display();
            if(b instanceof Flyable) System.out.print("Fly ");
            if(b instanceof Swimmable) System.out.print("Swim ");
            if(!(b instanceof Flyable) && !(b instanceof Swimmable)) System.out.print("None");
            System.out.println();
        }
    }

    public void displayFlying() {
        for(Bird b : birds) {
            if(b instanceof Flyable) {
                b.display();
                System.out.println();
            }
        }
    }

    public void displaySwimming() {
        for(Bird b : birds) {
            if(b instanceof Swimmable) {
                b.display();
                System.out.println();
            }
        }
    }

    public void removeById(int id) {
        for(int i = 0; i < birds.size(); i++) {
            if(birds.get(i).getId() == id) {
                birds.remove(i);
                System.out.println("Bird removed");
                return;
            }
        }
        System.out.println("Bird not found");
    }

    public void report() {
        int fly = 0;
        int swim = 0;
        int both = 0;
        int none = 0;

        for(Bird b : birds) {
            boolean f = b instanceof Flyable;
            boolean s = b instanceof Swimmable;

            if(f && s) both++;
            else if(f) fly++;
            else if(s) swim++;
            else none++;
        }

        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + none);
    }
}