package com.collections;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {

		// date type // variable declaration// initialization
		int dollars = 10;
		System.out.println("I got money from the atm : $ " + dollars);

		// this is one of the way to write array

		int[] grades = { 70, 75, 80, 82 };
	

		// System.out.println("The student grades are : " + grades);// not allowing
		// print this way!!!!!

		// To print arrays, there are couple of ways:
		// 1. create a loop
		// 2. to use another method using the array class

		// Print using the Loop. We can use the for loop.
//		for(int i = 0; i<10; i++) {
//			System.out.println("I am inside loop " + i);
//		}
		for (int i = 0; i < grades.length; i++) {
			System.out.println("Students grades are " + grades[i]);
		}

		// print using the Arrays class
		System.out.println("The student grades are : " + Arrays.toString(grades)); // ALLOWS PRINTING !!!

		// If we just want the value of the index . We specify the index we want to
		// print
		System.out.println("The value of the index 2 is :" + grades[2]);

		// Since we been working for 5 years and below java 1.5 this is how we used to
		// do it.
		// There is another way to write an array.
		// We create an object and store it in the array

		int[] salary = new int[4]; // 4 here is called an index. Arrays follow an index theory 
									// Index is always 1 less than the total.

		salary[0] = 90000; // 1st index
		salary[1] = 100000; // 2nd index
		salary[2] = 120000; // 3rd index
		salary[3] = 150000; // 4th index

		System.out.println("The salary of employee is : " + Arrays.toString(salary));

		for (int i = 0; i < salary.length; i++) {
			System.out.println("The employee salaries are " + salary[i]);
		}

		// Advance for loop
		for (int numbers : salary) {
			System.out.println("The advance for loop is " + numbers);
		}
		// If we just want the value of the index . We specify the index we want to
		// print
		System.out.println("The value of the index 3 is :" + salary[3]);

		// Multi-dimension is a table format. It has two array square brackets and two
		// curly brackets.

		int[][] lotto = { { 70, 75, 80, 82, 79 }, { 20, 45, 65, 51, 4 } };
		System.out.println("The lotto number at row index 1 and column index 2 is " + lotto[1][2]);
		System.out.println("The lotto number at row index 0 and column index 3 is " + lotto[0][3]);

	}

}
