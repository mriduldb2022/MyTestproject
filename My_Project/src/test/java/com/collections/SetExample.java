package com.collections;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {

		// HASHSET
		// doesn't follow insertion order
		// doesn't print duplicate value in HASHSET.
		// Only takes one null value.
		Set<String> Knives = new HashSet<String>();
		Knives.add("Fishing");
		Knives.add("Butter");
		Knives.add("Fishing"); // its a duplicate value but it doesn't print
		Knives.add(null);
		Knives.add(null);
		Knives.add(null);
		Knives.add(null);
		Knives.add("Steak");

		System.out.println(Knives);

		// LINKEDHASHSETS
		// Follows insertion order, doesn't print null and no duplicates
		Set<String> toy = new LinkedHashSet<String>();
		toy.add(null);
		toy.add(null);
		toy.add(null);
		toy.add("Car");
		toy.add("Car");
		toy.add("Car");
		toy.add("Car");
		toy.add("Car");
		toy.add("Doll");
		toy.add("house");

		System.out.println(toy);

		
		// TREESET 
		//INSERTION order is Ascending , No duplicate value, (Doen't allow to add "null value").
	
		Set<String> student = new TreeSet <String>();
		
		student.add("alam");
		student.add("babu");
		student.add("hasan");
		student.add("mridul");
		student.add("mridul");
		//student.add(null); NOT ALLOWED !!
		
		System.out.println(student);
		
		
		
	}

}
