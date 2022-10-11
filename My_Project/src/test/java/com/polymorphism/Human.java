package com.polymorphism;

public class Human {

	// Method overloading - same method name but different parameter in same class
	// Method overloading is also called static binding
	//Method overloading is also called compile time polymorphism

	public void franklin() {

		System.out.println("Franklin is a Teacher");
	}

	public void franklin(String sibling) {

		System.out.println("Franklin has a brother name " + sibling );
	}

	public void franklin(int salary) {

		System.out.println("Franklin's salary is " + salary);
	}

	public void franklin(String sibling1, String sibling2) {

		System.out.println("Franklin is a brother ");
	}

	public void franklin(int salary, String sibling2) {

		System.out.println("Franklin is a brother ");
	}

	public static void main(String[] args) {
		
		Human obj = new Human();
		obj.franklin();
		obj.franklin("John");
		obj.franklin(1000000);
		
	}
}
