package com.strings;

public class StringExample {

	//String is a Non-Primitive data type
	//String is a Wrapper Class
	//String is Immutable-Means it does not change 
	
	//Examples of pre-defined (java created) Methods:
	
	public static void main(String[] args) {
		
		String first = "Smart";
		String last = "Tech";
		//System.out.println(first+last); //concatination = adding 2 string together
		System.out.println(first.concat(last));
		
		
		
		//Print out specific letters from a sentence /line
		String country = new String("United States");
		System.out.println(country.charAt(0));
		System.out.println(country.charAt(2));
		System.out.println(country.charAt(3));
		System.out.println(country.charAt(9));
		
		
		
		//Topic For Advance coding class: 
		//String equals method vs equal equal sign?
		//How to reverse the string ?
		//How to split the string?
	}
}
