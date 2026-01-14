package smartcheckout;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ManageCustomerAndItem {

	HashMap<String, Product> itemsHashMap;
	Queue<Customer> customers;

	public ManageCustomerAndItem() {
		this.itemsHashMap = new HashMap<>();
		this.customers = new LinkedList<>();
	}

	public void addItem(Product product) {
		itemsHashMap.put(product.getName(), product);
		System.out.println("Item added: " + product.getName());
	}
   
	public void addCustomer(Customer customer) {
		customers.add(customer);
		System.out.println("Customer added: " + customer.getName());
	}

	public void removeCustomer(Customer customer) {
		customers.remove(customer);
		System.out.println("Customer removed: " + customer.getName());
	}

	public Customer serveNextCustomer() {
		Customer served = customers.poll();
		if (served != null) {
			System.out.println("Serving customer: " + served.getName());
		} else {
			System.out.println("No customers in queue.");
		}
		return served;
	}

	public void purchesItem(Product p, int quantity) {

		if (p == null) {
			System.out.println("Product not found!");
			return;
		}

		if (quantity <= 0) {
			System.out.println("Invalid quantity!");
			return;
		}

		if (p.getQuantity() < quantity) {
			System.out.println("Not enough stock for: " + p.getName());
			return;
		}

		p.setQuantity(p.getQuantity() - quantity);
		itemsHashMap.put(p.getName(), p);

		System.out.println(quantity + " " + p.getName() + " purchased. Remaining: " + p.getQuantity());
	}

	public void displayAllItems() {
		System.out.println("\n Item List");
		if (itemsHashMap.isEmpty()) {
			System.out.println("No items available.");
			return;
		}

		for (Product p : itemsHashMap.values()) {
			System.out.println(p);
		}
	}

	public void displayAllCustomers() {
		System.out.println("\n Customer Queue ");
		if (customers.isEmpty()) {
			System.out.println("No customers in queue.");
			return;
		}

		for (Customer c : customers) {
			System.out.println(c);
		}
	}
}
