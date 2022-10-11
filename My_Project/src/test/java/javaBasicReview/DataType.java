package javaBasicReview;

public class DataType {

	public static void main(String[] args) {
	
		/*
		 Byte
		 Minimum = -128
		 Maximum = 127
		 Default = o
		 */

		byte bytedata; //Declare the the variable 
		// if i write : byte byte data = 127; Initialization the variable
		bytedata = 127;
		System.out.println("My data type value is: " + bytedata);
		
		//Local variable -Inside the class and inside the method 
		//Instance variable -  
		//Static variable - 
		
		
		/* 
		 short 
		 Minimum = -128
		 Maximum = 127
		 Default = o
		 */
		
		short shortdata =32767; //Initialization of the variables
		System.out.println("My data type value is: " + shortdata);
		
		/* 
		 Long 
		 Minimum = -2^63
		 Maximum = 2^63-1
		 Default = o
		 */
		long longdata = 100000000L; //Initialization of the variable 
		System.out.println("My data type value is: " + longdata);
		
		
		/* 
		 int 
		 Minimum = - Two Billion
		 Maximum = Two Billion
		 Default = o
		 */
		int intdata = 1000; //Initialization of the variable 
		System.out.println("My data type value is: " + intdata);
		
		double doubledataType = 100.10;
		System.out.println("My data type value is: " + doubledataType);
		
		float floatdataType = 100.123f;
		System.out.println("My data type value is: " + floatdataType);
		
		//boolean boolendatatype = true;
		//boolean booleandatatype = false;
		//System.out.println("My data type value is: " + booleandatatype);
		
		//char chardataType = '@';
	}

}
