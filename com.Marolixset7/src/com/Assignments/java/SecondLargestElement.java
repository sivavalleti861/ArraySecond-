package com.Assignments.java;

import java.util.Arrays;

public class SecondLargestElement {
	public static void main(String[] args) {
		int[] array = { 10, 5, 8, 20, 15 }; // Replace this array with your own

		if (array.length < 2) {
			System.out.println("Array length is less than 2. No second largest element found.");
			return;
		}

		Arrays.sort(array);

		int secondLargest = array[array.length - 2];
		System.out.println("The second largest element is: " + secondLargest);
	}
}
