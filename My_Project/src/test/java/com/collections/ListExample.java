package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {

	//Why do we need a list?
	//To handle the array fixed length problem
	
	//List is a  Java interface. Its has a super interface called collection 
	//which has a super interface called Iterable. (top level interface)
	
	//Java collection framework has many interface. List is one of the interface.
	
	//How do you create a LIST in java?
	
	public static void main(String[] args) {
		
		//formula for LIST. Use datatype using the class. Use non-primitive data type. 
		//Non-Primitive data type is also called wrapper class. 
		
		List <Integer> number = new ArrayList <Integer>();
		number.add(10); //index 0
		number.add(15);// index 1
		number.add(10);//index 2
		number.add(30);//index 3
		
		System.out.println("The numbers in the list are :" +number);
		
		//using loop :
		for (int i = 0; i < number.size(); i++) {
			System.out.println("The numbers in the list are :" +number.get(i));
		}
		
		//Just print out one of the index
		System.out.println("The value of the index 2 is :" +number.get(2));
		
		//just to print using advance loop
		for (Integer num : number) {
			System.out.println("The numbers in the list are :" +num);
		}
		
		
		//Array list is using index theory 
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(20);
		numbers.add(40);
		numbers.add(null);
		numbers.add(null);
		System.out.println("The numbers in the list are :" +numbers);
		
		
		
		//Link list using linked theory 
		LinkedList<String> name = new LinkedList<String>();
		name.add("mridul");
		System.out.println(name);
		
		List <String> books = new Vector <String>();
		books.add("Harry Potter");
		System.out.println("My fav book is : " + books);
	}
	
}
