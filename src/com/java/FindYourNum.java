package com.java;

import java.util.Scanner;

public class FindYourNum {

	public static Scanner scanner = new Scanner(System.in);

	public void findNumber(int low, int high) {

		if (low == high) {
			System.out.println("Your Num is : " + low);
			System.out.println("Intermediatory Num is: " + (low - 1) + " and " + (low + 1));
			return;
		}

		int middle = (low + high) / 2;
		int choice;
		System.out.println("Press 1 if the num is between : " + low + " and " + middle);
		System.out.println("Press 2 if the num is between : " + (middle + 1) + " and " + high);
		choice = scanner.nextInt();

		if (choice == 1) {
			findNumber(low, middle);
		} else {
			findNumber(middle + 1, high);
		}
	}

	public static void main(String[] args) {

		FindYourNum num = new FindYourNum();
		System.out.println("Enter a num between 0 and 100");

		int N = scanner.nextInt();
		num.findNumber(0, N);
		scanner.close();

	}

}
