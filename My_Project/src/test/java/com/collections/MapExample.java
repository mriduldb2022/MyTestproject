package com.collections;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		//HASHMAP
		//If no data type specified, its is generic
		// Map boroughs = new HashMap();
		//Hash map does not have insertion order 
		Map<String,String> boroughs = new HashMap<String, String>();
		boroughs.put("Yellow", "Bronx");
		boroughs.put("Blue", "Manhattan");
		boroughs.put("Green", "Brooklyn");
		boroughs.put("Violet", "Queens");
		boroughs.put("Brown", "Staten Island");
		boroughs.put("Brown", "Hicksvill");
		boroughs.put("Brown", null);
		boroughs.put("orange", null); //Map can have many null values 
		boroughs.put(null, "Hicksvill");
		boroughs.put(null, "Garden city");//but map only has one null key 
		
		
		System.out.println(boroughs);
		
		
		//how to print Map in each line? use advance for loop
		
		for(Map.Entry<String,String> m : boroughs.entrySet()) {
			
			System.out.println("Key : " +m.getKey()+ " - Value : "+ m.getValue());
			
		}
		
		//LINKEDHASHMAP
		//LINKED HASHMAP WILL HAVE INSERTION ORDER
		Map<Integer, String>  student = new LinkedHashMap<Integer, String>();
		student.put(10, "alam");
		student.put(20, "babu");
		student.put(30, "hasan");
		student.put(40, "mridul");
		student.put(17, "mridul");
		
		System.out.println(student);
		
		
		//TREEMAP
		// follows ascending order in key.
		Map<Integer,String> department = new TreeMap <Integer,String>();
		
		department.put(15, "HR");
		department.put(25, "accounting");
		department.put(35, "IT");
		department.put(45, "sociology");
		department.put(23, "science");
		
		System.out.println(department);
		
		//HASHTABLE
		Hashtable<String, String> creds = new Hashtable <String, String>();
		creds.put("user@sample.com", "123no");
		creds.put("user@ample.com", "124and");
		System.out.println(creds);
		
		
	}
	
	
}
