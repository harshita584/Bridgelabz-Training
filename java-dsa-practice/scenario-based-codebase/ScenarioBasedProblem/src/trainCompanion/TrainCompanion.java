package trainCompanion;

class Node{
	String data;
	Node next;
	Node prev;
	
	public Node(String data)
	{
		this.data = data;
		this.next = null;
		this.next = null;
	}
}

public class TrainCompanion {
	Node head;
	Node curr;
	
	// add compartments
	void addCompartment(String name) {
		Node temp = new Node(name);
		if(head == null)
		{
			curr = temp;
			head = temp;
			return;
		}
		
		Node node = head;
		while(node.next != null)
		{
			node = node.next;
		}
		
		node.next = temp;
		temp.prev = node;
		node = temp;
	}
	
	void display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	// remove compartments
	void removeCompartment(String name) {
		Node temp = head;
		if(head.data.equals(name))
		{
			head = head.next;
			return;
		}
		
		while(temp != null)
		{
			if(temp.data.equals(name))
			{
				if(temp.next == null)
				{
					temp.prev.next = null;
					break;
				}
				temp.prev.next = temp.next;
				temp.next.prev = temp.prev;
			    break;
			}
			temp = temp.next;
		}
	}
	
	// move ahead to the compartments
	void moveAhead() {
		if(head == null) {
			System.out.println("Please enter compartment!");
			return;
		}
		if(curr.next == null) {
			System.out.println("No next compartment");
			return;
		}
		
		curr = curr.next;
		System.out.println("Move to " + curr.data);
	}
	
	void moveBackward() {
		if(head == null)
		{
			System.out.println("Please enter Compartment!");
			return;
		}
		if(curr.prev == null)
		{
			System.out.println("No previous Compartment!");
			return;
		}
		curr = curr.prev;
		System.out.println("Move to " + curr.data);
	}
	
	
	// display adjacent compartment
	void showAdjacentCompartment() {
		if(head == null)
		{
			System.out.println("Enter Compartment!");
			return;
		}
		
		if(curr.next == null){
			System.out.println("Next compartment is not available!");
			}
		else {
			System.out.println("Next compartment of current compartment is " + curr.next.data);
		}
		
		
		if(curr.prev == null) {
			System.out.println("Previous compartment is not available!");
		}
		else {
			System.out.println("Previous compartment of current compartment is " + curr.prev.data);
		}
	}


	
	public static void main(String[] args) {
		TrainCompanion obj = new TrainCompanion();
		obj.addCompartment("Wifi");
		obj.addCompartment("pantry");
		obj.addCompartment("Waiting room");
		obj.addCompartment("Ticket counter");
		
		obj.display();
		
		obj.moveAhead();
		obj.moveAhead();
		
		obj.moveBackward();
		
		obj.showAdjacentCompartment();
		
		obj.removeCompartment("pantry");
	}

}
