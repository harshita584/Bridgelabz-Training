package com.linkedlist.singlylinkedlist;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;

class ItemNode{
	String itemName;
	int itemID;
	int quantity;
	double price;
	ItemNode next;
	
	public ItemNode(String itemName, int itemID, int quantity, double price)
	{
		this.itemName = itemName;
		this.itemID = itemID;
		this.quantity = quantity;
		this.price = price;
		this.next = null;
	}
}

class ItemLinkedList{
	private ItemNode head;
	
	// 1. add an item at the beginning
	public void addAtBeginning(String itemName, int itemID, int quantity, double price)
	{
		ItemNode newNode = new ItemNode(itemName, itemID, quantity, price);
		newNode.next = head;
		head = newNode;
	}
	
	// 2. add an item at the end
	public void addAtEnd(String itemName, int itemID, int quantity, double price)
	{
		ItemNode newNode = new ItemNode(itemName, itemID, quantity, price);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		ItemNode temp = head;
		while(temp.next != null)
		{
		 temp =	temp.next;
		}
		temp.next = newNode;
	}
	
	// 3. add an item at the specific position
	public void addAtSpecificPosition(int position, String itemName, int itemID, int quantity, double price)
	{
		ItemNode newNode = new ItemNode(itemName, itemID, quantity, price);
		if(position <= 0)
		{
			System.out.println("Invalid position");
			return;
		}
		
		if(position==1)
		{
			addAtBeginning(itemName, itemID, quantity, price);
			return;
		}
		
		ItemNode temp = head;
		for(int i=1; i<position-1 && temp!=null; i++)
		{
			temp = temp.next;
		}
		
		if(temp==null)
		{
			System.out.println("Position is out of range!");
		}else {
			temp.next=newNode;
		}
	}
		
		// 4. remove an item based on ItemID
		 public void removeByItemId(int itemID)
		 {
			 if(head == null)
			 {
				 System.out.println("list is empty.");
				 return;
			 }
			 if(head.itemID == itemID)
			 {
				 head = head.next;
			 }
			 
			 ItemNode temp = head;
			 while(temp.next !=null && temp.next.itemID != itemID)
			 {
				 temp = temp.next;
			 }
			 
		    if(temp.next == null)
		    {
		    	System.out.println("Record not found.");
		    	return;
		    }
		    
		    temp.next = temp.next.next;
		    System.out.println("Item deleted successfully.");
		 
		 }
		 
		 // 5. update the item of an item by Item ID
		 public void updateByItemID(int itemId, int updateQuantity)
		 {
			 ItemNode temp = head;
			 while(temp!=null)
			 {
				 if(temp.itemID == itemId)
				 {
					 temp.quantity = updateQuantity;
					 System.out.println("Quantity updated successfully.");
					 return;
				 }
				 temp = temp.next;
			 }
			 System.out.println("Record not found!");
		 }
		 
		 // 6. Search for an item based on Item ID or Item Name
		 public void searchByItemName(String itemName)
		 {
			 ItemNode temp = head;
			 while(temp!=null)
			 {
				 if(temp.itemName == itemName)
				 {
					 System.out.println("Item Found:");
					 System.out.println("Item name: " + temp.itemName);
					 System.out.println("Item ID: " + temp.itemID);
					 System.out.println("Item Quantity: " + temp.quantity);
					 System.out.println("Item Price: " + temp.price);
					 return;
				 }
				 temp = temp.next;
			 }
			 System.out.println("Item not Found!");
		 }
		 
		 // 7. Calculate and display the total value of inventory
		 public void calculateInventory()
		 {
			 if(head == null)
			 {
				 System.out.println("Inventory is empty");
				 return;
			 }
			 double total = 0.0;
			 ItemNode temp = head;
			 while(temp!=null)
			 {
				 total += temp.price*temp.quantity;
				 temp = temp.next;
			 }
			 System.out.println("Total Inventory price: " + total);
		 }

		 // 8. Sort inventory by Price in increasing order using Priority Queue
		 public void sortByPriceAscending() {
		     if (head == null || head.next == null) {
		         return; // Empty or already sorted
		     }

		     // Min Heap based on price
		     PriorityQueue<ItemNode> pq = new PriorityQueue<>(
		         Comparator.comparingDouble(node -> node.price)
		     );

		     // Add all nodes to Priority Queue
		     ItemNode temp = head;
		     while (temp != null) {
		         pq.add(temp);
		         temp = temp.next;
		     }

		     // Rebuild the linked list
		     head = pq.poll();
		     temp = head;

		     while (!pq.isEmpty()) {
		         temp.next = pq.poll();
		         temp = temp.next;
		     }

		     temp.next = null; // prevent cycle

		     System.out.println("Inventory sorted by Price (Ascending).");
		 }
		 
		// 8. Display all items in inventory
		 public void displayInventory() {
		     if (head == null) {
		         System.out.println("Inventory is empty.");
		         return;
		     }

		     ItemNode temp = head;
		     System.out.println("\n---- Inventory Items ----");
		     while (temp != null) {
		         System.out.println(
		             "Item Name: " + temp.itemName +
		             ", Item ID: " + temp.itemID +
		             ", Quantity: " + temp.quantity +
		             ", Price: " + temp.price
		         );
		         temp = temp.next;
		     }
		 }

}



public class InventoryManagementSystem {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        ItemLinkedList list = new ItemLinkedList();
            
            while (true) {
                System.out.println("\n--- Inventory Management System ---");
                System.out.println("1. Add at Beginning");
                System.out.println("2. Add at End");
                System.out.println("3. Add at Position");
                System.out.println("4. Delete by ItemNo.");
                System.out.println("5. Update by item id");
                System.out.println("6. search for an item");
                System.out.println("7. sort the inventory");
                System.out.println("8. Display the inventory");
                System.out.println("9. Exit");

                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1: {
                        System.out.print("Enter ItemName: ");
                        String itemName = sc.nextLine(); 
                        
                        System.out.print("Enter ItemID: ");
                        int itemID = sc.nextInt();

                        System.out.print("Enter quantity: ");
                        int quantity = sc.nextInt();

                        System.out.print("Enter price: ");
                        double price = sc.nextDouble();

                        list.addAtBeginning(itemName, itemID, quantity, price);
                        break;
                    }

                    case 2: {
                    	System.out.print("Enter ItemName: ");
                        String itemName = sc.nextLine(); 
                        
                        System.out.print("Enter ItemID: ");
                        int itemID = sc.nextInt();

                        System.out.print("Enter quantity: ");
                        int quantity = sc.nextInt();

                        System.out.print("Enter price: ");
                        double price = sc.nextDouble();

                        list.addAtEnd(itemName, itemID, quantity, price);
                        break;
                    }

                    case 3: {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                         
                    	System.out.print("Enter ItemName: ");
                        String itemName = sc.nextLine(); 
                        
                        System.out.print("Enter ItemID: ");
                        int itemID = sc.nextInt();

                        System.out.print("Enter quantity: ");
                        int quantity = sc.nextInt();

                        System.out.print("Enter price: ");
                        double price = sc.nextDouble();

                        list.addAtSpecificPosition(pos, itemName, itemID, quantity, price);
                        break;
                    }

                    case 4: {
                        System.out.print("Enter ItemID to delete: ");
                        int item = sc.nextInt();

                        list.removeByItemId(item);
                        break;
                    }

                    case 5: {
                    	System.out.print("Enter ItemID to delete: ");
                        int item = sc.nextInt();
                     
                        System.out.print("Enter New Quantity: ");
                        int updateQuantity = sc.nextInt();
                        
                        list.updateByItemID(item, updateQuantity);
                        break;
                    }

                    case 6: {
                        System.out.print("Enter itemName: ");
                        String itemName = sc.nextLine();
                        list.searchByItemName(itemName);
                        break;
                    }

                    case 7: {
                    	list.calculateInventory();
                    	break;
                    }
                    
                    case 8:
                        list.displayInventory();
                        break;

                    case 9:
                        System.out.println("Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            }

        
	}
}
