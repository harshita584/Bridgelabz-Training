package birdSantuary;

import java.util.*;

public class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sanctuary sanctuary = new Sanctuary();

        while(true) {
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Display Flying Birds");
            System.out.println("4. Display Swimming Birds");
            System.out.println("5. Delete Bird by ID");
            System.out.println("6. Sanctuary Report");
            System.out.println("7. Exit");

            int ch = sc.nextInt();

            if(ch == 1) {
                System.out.print("Enter id : ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name : ");
                String name = sc.nextLine();
                System.out.print("1:Eagle 2:Duck 3:Penguin 4:Kiwi - ");
                int type = sc.nextInt();

                if(type == 1) sanctuary.addBird(new Eagle(id, name));
                else if(type == 2) sanctuary.addBird(new Duck(id, name));
                else if(type == 3) sanctuary.addBird(new Penguin(id, name));
                else sanctuary.addBird(new Kiwi(id, name));
            }

            else if(ch == 2) sanctuary.displayAll();
            else if(ch == 3) sanctuary.displayFlying();
            else if(ch == 4) sanctuary.displaySwimming();
            else if(ch == 5) {
                System.out.print("Enter id : ");
                sanctuary.removeById(sc.nextInt());
            }
            else if(ch == 6) sanctuary.report();
            else break;
        }
    }
}