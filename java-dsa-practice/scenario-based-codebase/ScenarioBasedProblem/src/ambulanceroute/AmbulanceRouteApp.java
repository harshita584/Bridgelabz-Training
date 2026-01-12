package ambulanceroute;

public class AmbulanceRouteApp {

    public static void main(String[] args) {

        ConnectUnits route = new ConnectUnits();

        
        route.addUnits("Emergency",  true);  
        route.addUnits("Radiology", false);   
        route.addUnits("Surgery", true);      
        route.addUnits("ICU", false);         

        
        System.out.println("Emergency available? " + route.getStatus("Emergency"));
        System.out.println("Radiology available? " + route.getStatus("Radiology"));
        System.out.println("Surgery available? " + route.getStatus("Surgery"));
        System.out.println("ICU available? " + route.getStatus("ICU"));

        System.out.println("\nPatient needs Emergency...");

        
        redirectPatient(route, "Emergency");
        

        System.out.println("\nRadiology is under maintenance, removing it...");
        route.removeUnit("Radiology");

        System.out.println("\nPatient again needs Emergency...");
        redirectPatient(route, "Emergency");
        route.displayUnits();
        
    }

    
    public static void redirectPatient(ConnectUnits route, String startUnit) {

        String currentUnit = startUnit;

        
        for (int i = 0; i < 4; i++) {

            boolean status = route.getStatus(currentUnit);

            if (status) {
                System.out.println(" Patient redirected to: " + currentUnit);
                route.updateStatus(currentUnit, false);
                return;
            } else {
                System.out.println(currentUnit + " is not available, checking next unit...");
            }

           
            if (currentUnit.equals("Emergency")) {
                currentUnit = "Radiology";
            } else if (currentUnit.equals("Radiology")) {
                currentUnit = "Surgery";
            } else if (currentUnit.equals("Surgery")) {
                currentUnit = "ICU";
            } else if (currentUnit.equals("ICU")) {
                currentUnit = "Emergency";
            }
        }

        System.out.println(" No units available. Patient must wait.");
    }
}


