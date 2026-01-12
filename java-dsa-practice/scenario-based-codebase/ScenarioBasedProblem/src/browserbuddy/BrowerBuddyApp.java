package browserbuddy;


public class BrowerBuddyApp {

    public static void main(String[] args) {

        ManageWebPages manager = new ManageWebPages();

        System.out.println("=== Adding Pages ===");
        manager.addPage("google.com");
        manager.addPage("youtube.com");
        manager.addPage("github.com");
        manager.addPage("stackoverflow.com");

        manager.displayPages();

        System.out.println("=== Removing a Page (github.com) ===");
        manager.removePage("github.com");
        manager.displayPages();

        System.out.println("=== Removing Window (Close all tabs) ===");
        manager.removeWindow();
        manager.displayPages();

        System.out.println("=== Restoring Window ===");
        manager.restoreWindow();
        manager.displayPages();

        System.out.println("=== Adding New Page After Restore ===");
        manager.addPage("chatgpt.com");
        manager.displayPages();

        System.out.println("=== Removing Window Again ===");
        manager.removeWindow();
        manager.displayPages();

        System.out.println("=== Restoring Window Again ===");
        manager.restoreWindow();
        manager.displayPages();
    }
}
