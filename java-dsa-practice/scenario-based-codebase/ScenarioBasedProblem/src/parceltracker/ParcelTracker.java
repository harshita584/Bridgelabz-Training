package parceltracker;

class Node{
	String stages;
	Node next;
	
	public Node(String stages){
		this.stages = stages;
		this.next = null;
	}
}


public class ParcelTracker {
    Node head;
    Node curr;
	
    // adding stages to the list
    public void addStages(String stages)
    {
    	Node newNode = new Node(stages);
    	
    	if(head == null)
    	{
    		head = newNode;
    		curr = head;
    		return;
    	}
    	
    	Node last = head;
    	while(last.next != null)
    	{
    		last = last.next;
    	}
    	last.next = newNode;
    }
    
    
    // Add custom intermediate checkpoints(add after the given pos)
    public void addCustomCheckpointsRight(String stages, String pos)
    {   
    	Node temp = head;
    	while(temp != null)
    	{
    		if(temp.stages.equals(pos))
    		{
    		   Node newNode = new Node(stages);
    		   newNode.next = temp.next;
    		   temp.next = newNode;
    		   return;
    		}
    		temp = temp.next;
    	}
    	System.out.println("Stage not found");
    }
    
    // Add custom intermediate checkpoints(add before the given pos)
    public void addCustomCheckpointsLeft(String stages, String pos)
    {
    	// adding before head
        if (head != null && head.stages.equals(pos))
    	{
    	    Node newNode = new Node(stages);
    	    newNode.next = head;
    	    head = newNode;
    	    return;
    	}
    	
        Node prev = head;
        Node temp = head.next;

        while (temp != null)
        {
            if (temp.stages.equals(pos))
            {
                Node newNode = new Node(stages);
                prev.next = newNode;
                newNode.next = temp;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
        System.out.println("Stage not found");
    }
    
    // missing the parcel
 // simulate missing parcel by breaking link after "Shipped"
    public void missingStage()
    {
        Node temp = head;
        while (temp != null)
        {
            if (temp.stages.equals("Shipped"))
            {
                temp.next = null; 
                return;
            }
            temp = temp.next;
        }
    }
    	
 // forward tracking through stages with lost/missing parcel handling
    public void forwardTracking()
    {
    	curr = head;
        if (curr == null)
        {
            System.out.println("No tracking data available.");
            return;
        }

        // if next is null, decide whether delivery is complete or tracking is lost
        System.out.println("Current Stage: " + curr.stages);
        while(curr != null) {
        	 if (curr.next == null)
             {
                 if (curr.stages.equals("Feedback Received"))
                 {
                     System.out.println("Parcel delivered. Tracking completed.");
                 }
                 else
                 {
                     System.out.println("Tracking data missing. Parcel may be lost.");
                 }
                 return;
             }
             curr = curr.next;
             System.out.println("Current Stage: " + curr.stages);
        }
    }

    
    // displaying the list
    public void display() {
     Node temp = head;
     while(temp != null)
     {
    	 System.out.print(temp.stages);
    	   if(temp.next != null)
    	   {
    		   System.out.print(" -> ");
    	   }
    	   temp = temp.next;
     }
    }
    
	public static void main(String[] args) {
		ParcelTracker obj = new ParcelTracker();
		// default stages
		obj.addStages("Packed");
		obj.addStages("Shipped");
		obj.addStages("In Transit");
		obj.addStages("Delivered");
 
		obj.display();
		System.out.println();
		
		// custom stages adding to the right
		obj.addCustomCheckpointsRight("Ready for Dispatch", "Packed");
		obj.addCustomCheckpointsRight("Customer Notified", "Delivered");
		obj.addCustomCheckpointsRight("Feedback Requested", "Customer Notified");
		obj.addCustomCheckpointsRight("Feedback Received", "Feedback Requested");
		
		System.out.println("\nAfter insertion at right");
		obj.display();
		
		// custom stages adding to the right
		obj.addCustomCheckpointsLeft("Order Received", "Packed");
		obj.addCustomCheckpointsLeft("Reached Local Warehouse", "In Transit");
				
		System.out.println("\nAfter insertion at left");
		obj.display();
		
		// forward tracking
		System.out.println();
		System.out.println();
		obj.forwardTracking();
		
		
		// missing logic
		System.out.println();
		System.out.println();
		obj.missingStage();
		obj.forwardTracking();
	}

}
