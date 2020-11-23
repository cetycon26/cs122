package com.cs122.assignments;

public class StackList {
	private StackNode top;
	int count = 0;
	
	private class StackNode{
		public String item;
		public StackNode next;
		
		public StackNode(String s) {
			item = s;
			next = null;
		}
	}
	
	public StackList() {
		top = null;
	}
	
	public void push(String s) { //add to top
		StackNode node = new StackNode(s);
		if(empty()) {
			top = node;
			count++;
		}
		else{
			StackNode newNode = node;
			newNode.next = top;
			top = newNode;
			count++;
		}

	}
	
	public void pop() { //remove and return top
		if(empty())
			System.out.println("Stack is empty: Cannot pop");
		else {
			StackNode temp = top.next;
			System.out.println(top.item);
			top.next = null;
			top = temp;
			count--;
		}
	}
	
	public void peek() { //return top
		if(empty())
			System.out.println("Stack is empty: Cannot peek");
		else {
			System.out.println(top.item);
		}
	}
	
	public boolean empty() {
		if(top == null)
			return true;
		return false;
	}
	
	public void print() {
		String result = "";

	    StackNode current = top;

	    while (current != null){
	    	result += current.item + " -> ";
	        current = current.next;
	    }       

	    System.out.println(result);
	}



}
