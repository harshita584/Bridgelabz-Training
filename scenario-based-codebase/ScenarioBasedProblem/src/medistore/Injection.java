package medistore;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Injection extends Medicine implements IShellable {
	String type;
	LocalDate openingDate;
   public Injection(String name, double price, String expiryDate,LocalDate openingDate, int quantity,String type) {
		super(name, price, expiryDate, quantity);
		this.type=type;
		this.openingDate=openingDate;
	}
@Override
public void sell() {
	quantity--;
	
}
@Override
public boolean checkExpiry() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    LocalDate printedExpiryDate = LocalDate.parse(expiryDate, formatter);
    LocalDate currentDate = LocalDate.now();

  
    if (currentDate.isAfter(printedExpiryDate)) {
        return false; 
    }

   
    if (openingDate != null) {
        LocalDate openingBasedExpiry = openingDate.plusDays(28);

        if (currentDate.isAfter(openingBasedExpiry)) {
            return false;
        }
    }

    return true;
}
@Override
public String toString() {
	return "Injection [type=" + type + ", openingDate=" + openingDate + ", name=" + name + ", price=" + price
			+ ", expiryDate=" + expiryDate + ", quantity=" + quantity + "]";
}



   
   
}
