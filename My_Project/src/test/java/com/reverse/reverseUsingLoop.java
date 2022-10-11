package com.reverse;

public class reverseUsingLoop {

	public static void main(String[] args) {
		
//		String str = "Geeks";
//		String newstr = "";
//		char ch;
//		System.out.println("Original word:" + str);
//		
//		for(int i=0;i<str.length();i++) {				// using i++ loop 
//			ch =str.charAt(i);
//			newstr = ch+newstr;
//		}
//		System.out.println("Reverse word: "+ newstr);
//		}
//		
	

	
	String M = "Geeks";
	String reverse = "";
	for (int i=M.length()-1;i>=0;i--) {				//using i-- loop
		reverse=reverse+M.charAt(i);
		}	
	System.out.println(reverse);
	}
}


