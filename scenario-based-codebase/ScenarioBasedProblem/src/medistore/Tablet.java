package medistore;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tablet extends Medicine implements IShellable {
    String type;
	public Tablet(String name, double price, String expiryDate, int quantity,String type) {
		super(name, price, expiryDate, quantity);
		this.type=type;
	}
	@Override
	public void sell() {
		quantity--;
		
	}
	@Override
	public boolean checkExpiry() {
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	        LocalDate inputDate = LocalDate.parse(expiryDate, formatter);
	        LocalDate currentDate = LocalDate.now();
	        if (inputDate.isBefore(currentDate)) {
	            return false;
	        } 
	        else if (inputDate.isAfter(currentDate)) {
	            return true;
	        } 
	        else {
	            return false;
	        }
	        
	}
	@Override
	public String toString() {
		return "Tablet [type=" + type + ", name=" + name + ", price=" + price + ", expiryDate=" + expiryDate
				+ ", quantity=" + quantity + "]";
	}
	

}
