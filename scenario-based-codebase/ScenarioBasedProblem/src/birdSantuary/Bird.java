package birdSantuary;

public abstract class Bird {
    private String name;
    private String species;
    private int id;

    public Bird(int id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }

    public int getId() {
        return id;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void display() {
        System.out.print(id + " " + name + " " + species);
    }
}