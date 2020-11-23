package com.cs122.assignments;


public class QueueList {

	public QueueNode top;
	public QueueNode rear;
	int count = 0;
	private class QueueNode{
		
		public String item;
		public QueueNode next;
		
		
		public QueueNode(String q) {
			item = q;
			next = null;
		}
		
	}
	public QueueList() {
		top = null;
	}
	
	public void enqueue(String q) { //add method
		QueueNode node = new QueueNode(q);
//		QueueNode current;
		
		if(empty()) {
			top = node;
			rear = node;
			count++;
		}
		else if(count == 1) {
			top.next = node;
			rear = node;
			count++;
		}
		else {
			rear.next = node;
			rear = node;
			count++;
		}
	}
	
	public void dequeue() { //delete
		if(empty())
			System.out.println("Queue is empty");
		else {
			QueueNode temp = top.next;
			top.next = null;
			top = temp;
			count--;
		}
	}
	
	public boolean empty() {
		if(top == null)
			return true;
		return false;
	}
	
	public void print() {
//		while(top.next != null) {
//			System.out.print(top.item + " --> ");
//			top = top.next;
//		
//		}
//		System.out.println(top.item + " --> ");
		String result = "";

        QueueNode current = top;

        while (current != null)
        {
            result += current.item + " -> ";
            current = current.next;
        }

        System.out.println(result);
	}
	
	
}
