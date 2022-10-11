package com.firstproject;

public class vehicle {

	// Instance variable is when you have variable that is outside
	// method but inside the class. Instance variable can be access
	// within the methods of the class
	
	
//If you have a static variable, you must use it 
	static int price;
	static String color;
	int milage;

	public static void main(String[] args) {

// method body -This is where we write the code.

		// Calling the method - 2 ways to call the method.
		// If it is a Static method, we can use the classname.methodname

		// If it is not a static method then,
		// we have to create an instance of the method

		vehicle.boats();
		vehicle.boats();
		vehicle.buses();

		// For non static method, we have to create an object
		// from the instance of the class.
		// 'new' keyword is used to create an object

		// here is the formula:
		vehicle obj = new vehicle();

		obj.car();
		obj.airplane(300);
		obj.boats();
		obj.boats("150000");
		
		
		//The default value for the data type 
		//The default value for the int is 0
		//The default value for the string is null
		////The default value for the float is 0.0
		
		
		// Instance of a class is creating a new object.
		// when using a class name to create method it becomes a constructor.

	}

// This is a void method 
	void car() {
		// Variables within the method call 'Local' variable

		price = 5;
		color = "Blue";
		milage = 30;
		String make = "Tesla";

		System.out.println(color);
	}
	
	void moped() {
		milage = 10;
		
	}

	// This is a non-void or a return type method
	int motorcycle() {
		return 0;
	}

	String trucks() {
		return "Ford";
	}

	Boolean isLowPrice() {
		return false;

	}

	// Static or Global level methods - can be accessed
	// from anywhere in the project
	static void boats() {
		price = 5;
		color = "Blue";
		int milage = 30;
		String make = "Tesla";

		System.out.println(color);
	}

	static String buses() {
		return "public";

	}
	// Parameterized (within parenthesis) method,
	// It's called argument method where we can pass a data.

	static void boats(String price) {

	}

	// Method signature-
	void airplane(int speed) {

	}

	// This private method properties will not be 
	//accessible from other classes
	private void trains() {
		String passenger = "";
	}

	// Use the protected access modifier when 
	//using the inheritance property
	protected void bicycles() {
		String passenger = "";

	}
	
	

}
