package com.collections.list;

public class FindNthFromEnd {
	private static Node getNthFromEnd(Node head, int n) {
		Node temp = head;
		
		for(int i = 0; i < n; i++) {
			if(temp == null) {
				System.out.println("Please enter a valid number");
				System.exit(1);
			}
			temp = temp.next;
		}
		
		while(temp != null) {
			temp = temp.next;
			head = head.next;
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		Node head = new Node(0);
		Node node2 = new Node(1);
		Node node3 = new Node(2);
		Node node4 = new Node(3);
		Node node5= new Node(4);
		
		head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		Node nthFromEndNode = getNthFromEnd(head, 3);
		System.out.println(nthFromEndNode.data);
	}
}
