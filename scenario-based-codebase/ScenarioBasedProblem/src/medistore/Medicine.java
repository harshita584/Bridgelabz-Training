package medistore;

public class Medicine {
String name;
double price;
String expiryDate;
int quantity;
public Medicine(String name, double price, String expiryDate, int quantity) {
	this.name = name;
	this.price = price;
	this.expiryDate = expiryDate;
	this.quantity = quantity;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getExpiryDate() {
	return expiryDate;
}

public void setExpiryDate(String expiryDate) {
	this.expiryDate = expiryDate;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}





}
