package smartcheckout;

import java.util.ArrayList;
import java.util.List;

public class Customer {
 String name;
 String number;
 List <Product> list;
public Customer(String name, String number) {
	this.name = name;
	this.number = number;
	this.list=new ArrayList<Product>();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void addItemInUserCart(Product product) {
	list.add(product);
	}

@Override
public String toString() {
    return "Customer [Name=" + name + ", Number=" + number + "]";
}

 
}
