package com.Practice;

public class ArrayPractice {
	
	public static void main(String[] args) {
		
		String [] Teacher;
		
		Teacher = new String [10];
		
		Teacher[0]= "Mridul";
		Teacher[1]= "Franklyn";
		Teacher[2]= "John";
		Teacher[3]= "Mridul";
		Teacher[4]= "Franklyn";
		Teacher[5]= "John";
		Teacher[6]= "Mridul";
		Teacher[7]= "Franklyn";
		Teacher[8]= "John";
	
		
		for (int i = 0; i <Teacher.length; i++) {
			System.out.println(Teacher[i]);
		}
		
		
	}

}
