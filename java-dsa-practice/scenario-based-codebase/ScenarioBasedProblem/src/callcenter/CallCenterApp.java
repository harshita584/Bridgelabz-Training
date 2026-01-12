package callcenter;

public class CallCenterApp {
    public static void main(String[] args) {
        CallCenterManager manager = new CallCenterManager();

        System.out.println("\t Incoming Calls");
        manager.receiveCall("Sanjay", false);
        manager.receiveCall("Deepak", true); 
        manager.receiveCall("Rajesh", false);  
        manager.receiveCall("Karan", true);   

        System.out.println("\n\t Service Desk ");
        manager.processNextCall(); 
        manager.processNextCall(); 
        manager.processNextCall(); 

        System.out.println("\n\t Monthly Statistics ");
        manager.displayCallStats("Karan");
        manager.displayCallStats("Sanjay");
    }
}