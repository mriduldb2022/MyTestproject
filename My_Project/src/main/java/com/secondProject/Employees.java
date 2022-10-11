package com.secondProject;

public class Employees {

	// String dept_name; //Instance variable (Instance variable (globally) can not
	// use inside the static method)
	static String dept_name; // This is a Static variable (use the word Static at the front to use inside
								// static method)
	int monthly;// Instance variable

	public static void main(String[] args) {

		Employees.department();// This is how you call a static method
								// by writing Classname.methodname

		Employees obj = new Employees(); // this is how you call a non-static method.
		obj.salary(); // by creating an object
		System.out.println("My current location is : " + obj.location());

	}

	void salary() {
		int yearly = 100000; // yearly is a local variable
		monthly = 6000; // value of the instance variable
		System.out.println("My yearly salary is " + yearly);
		System.out.println("My monthly salary is " + monthly);

	}

	static void department() {
		dept_name = "It department"; // value of the static variable
		System.out.println("My dept is : " + dept_name);
	}
	
	
	String location() {
	return "New York City";
	}
	
}
