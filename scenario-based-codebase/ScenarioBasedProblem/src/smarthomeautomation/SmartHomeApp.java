package smarthomeautomation;

import java.util.Scanner;

public class SmartHomeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Appliance light = new Light();
        Appliance fan = new Fan(90);
        Appliance ac = new AC();

        UserController controller = new UserController();

        int choice;

        do {
            System.out.println("\n===== Smart Home Menu =====");
            System.out.println("1. Turn ON device");
            System.out.println("2. Turn OFF device");
            System.out.println("3. Show device status");
            System.out.println("4. Compare energy usage");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Turn ON which device?");
                    System.out.println("1. Light  2. Fan  3. AC");
                    int onChoice = sc.nextInt();

                    switch (onChoice) {
                        case 1: controller.operateDevice(light, true); break;
                        case 2: controller.operateDevice(fan, true); break;
                        case 3: controller.operateDevice(ac, true); break;
                        default: System.out.println("Invalid device");
                    }
                    break;

                case 2:
                    System.out.println("Turn OFF which device?");
                    System.out.println("1. Light  2. Fan  3. AC");
                    int offChoice = sc.nextInt();

                    switch (offChoice) {
                        case 1: controller.operateDevice(light, false); break;
                        case 2: controller.operateDevice(fan, false); break;
                        case 3: controller.operateDevice(ac, false); break;
                        default: System.out.println("Invalid device");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Device Status ---");
                    light.deviceStatus();
                    fan.deviceStatus();
                    ac.deviceStatus();
                    break;

                case 4:
                    System.out.println("Compare energy between:");
                    System.out.println("1. AC vs Light");
                    System.out.println("2. Fan vs Light");
                    int cmp = sc.nextInt();

                    if (cmp == 1) {
                        controller.compareEnergy(ac, light);
                    } else if (cmp == 2) {
                        controller.compareEnergy(fan, light);
                    } else {
                        System.out.println("Invalid option");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Smart Home Automation 👋");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
