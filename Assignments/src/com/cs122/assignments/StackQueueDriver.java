package com.cs122.assignments;

public class StackQueueDriver {

	public static void main(String[] args) {
		
		QueueList a = new QueueList();
		
		a.enqueue("one");
		a.enqueue("two");
		a.enqueue("four");
		a.print();
		a.dequeue();
		a.print();
		
//		StackList b = new StackList();
//		b.push("a");
//		b.push("b");
//		b.push("abc");
//		b.print();
//		b.peek();
//		b.pop();
//		b.print();



	}

}
