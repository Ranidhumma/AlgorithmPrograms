package com.java;

import java.util.Scanner;

public class InsertionSort {

	static Scanner scanner = new Scanner(System.in);

	/*
	 * @purpose: Ability to insertion sort
	 * 
	 * @param: Takes String array as input
	 * 
	 * @function : sorts the given array in ascending order and stores them.
	 */

	static public void insertionSort(String[] array) {
		for (int i = 1; i < array.length; i++) {
			String key = array[i];
			int j = i - 1;
			/*
			 * Compare key with each element on the left of it until an element smaller than
			 * it is found. for descending order, change key<array[j] to key>array[j].
			 */
			while (j >= 0 && (key.compareTo(array[j]) < 0)) {
				array[j + 1] = array[j];
				--j;
			}
			/* place key when word is smaller than it */
			array[j + 1] = key;
		}
	}

	/*
	 * @param: Takes String array as input, we are printing the given string array
	 */
	static public void printString(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println("string at index " + i + " is " + strings[i]);
		}
	}

	/*
	 * @param: Takes String array as input scan the data from user and stores in to
	 * string array
	 */

	static public void scanString(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.printf("Enter the string at index :%d\n", i);
			strings[i] = scanner.nextLine();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strings = new String[5];
		scanString(strings);
		System.out.println(" Before Sorting: ");
		printString(strings);
		insertionSort(strings);
		System.out.println("After Sorting: ");
		printString(strings);

	}
}
