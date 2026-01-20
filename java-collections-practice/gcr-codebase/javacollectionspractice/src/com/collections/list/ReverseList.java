package com.collections.list;

import java.util.ArrayList;

public class ReverseList {
	public static Node reverse(Node head) {
		Node prev = null;
		Node curr = head;
		Node next;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	public static void reverse(ArrayList<Integer> list) {
		int i = 0;
		int j = list.size()-1;
		
		while(i < j) {
			int temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
			i++;
			j--;
		}
	}
	
	public static void printLinkedList(Node head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		
		printLinkedList(node1);
		Node head = reverse(node1);
		printLinkedList(head);
		
		System.out.println(arrayList);
		reverse(arrayList);
		System.out.println(arrayList);
	}
}
