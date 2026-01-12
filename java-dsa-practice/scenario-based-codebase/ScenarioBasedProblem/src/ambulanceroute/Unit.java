package ambulanceroute;

public class Unit {
  String unitName;
  boolean status;
  Unit nextUnit;
public Unit(String unitName, boolean status) {
	
	this.unitName = unitName;
	this.status = status;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
@Override
public String toString() {
	return "Unit [unitName=" + unitName + ", status=" + status + ", nextUnit=" + nextUnit + "]";
}

  
  
  
}
