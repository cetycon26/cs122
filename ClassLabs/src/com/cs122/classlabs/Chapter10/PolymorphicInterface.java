package com.cs122.classlabs.Chapter10;

public class PolymorphicInterface {
	public static void main(String[] args) {
		
		Speaker guest = new Writer();
		guest.speak();
		guest.announce("I am William Shakespeare");
		((Writer)guest).write();
		
		Speaker guest2 = new Teacher();
		guest2.speak();
		((Teacher)guest2).question();
		
		Speaker guest3 = new Singer();
		guest3.speak();
		((Singer)guest3).sing();
		
//		Speaker guest = new Philosopher();
//		guest.speak();// polymorphic
//		((Philosopher) guest).pointificate();
//		guest = new Dog();
//		guest.speak();
//		Philosopher guest2 = new Philosopher();
//		guest2.pointificate();
//		guest = guest2;
//		guest2.pointificate();
//		// guest2 = guest;
	}
}



