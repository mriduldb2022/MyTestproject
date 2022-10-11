package com.polymorphism;

public class HRChanges extends HumanResources {

	// Method Overriding- same method name, same parameter, different class
	// Method Overriding- same method from 'HumanResources'class with different data
	// loading
	// Method Overriding is also called Dynamic binding.
	// Method overriding is also called Runtime polymorphism

	public static void main(String[] args) {
		
		HumanResources obj = new HRChanges();
		obj.salary();
		
		
	}

	void salary() {
		int salary = 5000;
		System.out.println("My current salary today is  : " + salary);
	}

}
