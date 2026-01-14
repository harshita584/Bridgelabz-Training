package smartcheckout;

import java.util.Scanner;

public class SmartCheckoutApp {

	public static void main(String[] args) {

		ManageCustomerAndItem manager = new ManageCustomerAndItem();
		Scanner scanner = new Scanner(System.in);
		double totalAmount = 0;

		Product p1 = new Product("Milk", 50.0, 20);
		Product p2 = new Product("Bread", 30.0, 15);
		Product p3 = new Product("Eggs", 10.0, 100);

		manager.addItem(p1);
		manager.addItem(p2);
		manager.addItem(p3);

		Customer c1 = new Customer("Rahul", "9876543210");
		Customer c2 = new Customer("Amit", "9123456789");
		Customer c3 = new Customer("Neha", "9988776655");

		c1.addItemInUserCart(p3);
		c1.addItemInUserCart(p2);
		c1.addItemInUserCart(p1);
		c2.addItemInUserCart(p2);
		c2.addItemInUserCart(p1);

		manager.addCustomer(c1);
		manager.addCustomer(c2);
		manager.addCustomer(c3);

		manager.displayAllItems();
		manager.displayAllCustomers();

		System.out.println("\n Purchase Section");
		for (Product item : c1.list) {
			System.out.println("Product " + item.getName() + " Enter Quantity ");
			int quantity = scanner.nextInt();
			manager.purchesItem(item, quantity);
			totalAmount += item.getPrice() * quantity;
		}
		System.out.println("Your total Amount is :" + totalAmount);

		manager.displayAllItems();

		System.out.println("\nServing Customers ");
		manager.serveNextCustomer();
		manager.displayAllCustomers();

		manager.serveNextCustomer();
		manager.displayAllCustomers();

		System.out.println("\n Final Status ");
		manager.displayAllItems();
		manager.displayAllCustomers();

		scanner.close();

	}
}
