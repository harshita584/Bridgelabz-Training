package petpal;

public class PetPalApp {

    public static void main(String[] args) {

        Pet dog = new Dog("Buddy", 3);
        Pet cat = new Cat("Whiskers", 2);
        Pet bird = new Bird("Tweety", 1);

        Pet[] pets = { dog, cat, bird };

        for (Pet pet : pets) {
            pet.makeSound();
            pet.feed();
            pet.play();
            pet.sleep();
            pet.showStatus();
        }
    }
}
