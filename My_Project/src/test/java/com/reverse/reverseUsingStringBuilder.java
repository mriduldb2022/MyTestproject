package com.reverse;

public class reverseUsingStringBuilder {

	public static void main(String[] args) {
		
		String str = "Great Job";
		StringBuilder str00 = new StringBuilder();
		
		str00.append(str);  //Append a string into StringBuilder str00
		
		str00.reverse();   //Reverse StringBuilder str00
		
		System.out.println(str00);
		
		
	}
}
