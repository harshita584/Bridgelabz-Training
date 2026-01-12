package ambulanceroute;

public class ConnectUnits {

	Unit headUnit;
	
	public void addUnits(String name,boolean status) {
		Unit newUnit=new Unit(name, status);
		if(headUnit==null) {
			headUnit=newUnit;
			headUnit.nextUnit=newUnit;
			return;
		}
		Unit tempUnit=headUnit;
		while (tempUnit.nextUnit!=headUnit) {
			tempUnit=tempUnit.nextUnit;
		}
		newUnit.nextUnit=headUnit;
		tempUnit.nextUnit=newUnit;
	}
	
	public void removeUnit(String unitname) {
		if (headUnit==null) {
			System.out.println("there is no Unit present ");
			return;
		}
		Unit tempUnit=headUnit;
		while (tempUnit.nextUnit.unitName!=unitname&&tempUnit.nextUnit!=headUnit) {
			tempUnit=tempUnit.nextUnit;
			
		}
		if(tempUnit.nextUnit.unitName.contentEquals(unitname)) {
			tempUnit.nextUnit=tempUnit.nextUnit.nextUnit;
		}else {
			System.out.println("There is no this kind of unit available");
		}
		
	}
	
	public boolean getStatus(String node) {
	    if (headUnit == null) {
	        System.out.println("There is no unit present");
	        return false;
	    }

	    Unit tempUnit = headUnit;

	    do {
	        if (tempUnit.unitName.equals(node)) {
	            return tempUnit.status;
	        }
	        tempUnit = tempUnit.nextUnit;
	    } while (tempUnit != headUnit);

	    System.out.println("There is no such unit available: " + node);
	    return false;
	}

	public void updateStatus(String unitName, boolean newStatus) {
	    if (headUnit == null) {
	        System.out.println("No units present.");
	        return;
	    }

	    Unit temp = headUnit;

	    do {
	        if (temp.unitName.equals(unitName)) {
	            temp.setStatus(newStatus);
	            System.out.println(unitName + " status updated to " + (newStatus ? "Available" : "Occupied"));
	            return;
	        }
	        temp = temp.nextUnit;
	    } while (temp != headUnit);

	    System.out.println("Unit not found: " + unitName);
	}

	public void displayUnits() {
	    if (headUnit == null) {
	        System.out.println("No units present.");
	        return;
	    }

	    Unit temp = headUnit;

	    System.out.println("---- Hospital Units Route ----");

	    do {
	        System.out.println("Unit: " + temp.unitName + 
	                           " | Status: " + (temp.status ? "Available" : "Occupied"));
	        temp = temp.nextUnit;
	    } while (temp != headUnit);

	    System.out.println("\n");
	}

}
