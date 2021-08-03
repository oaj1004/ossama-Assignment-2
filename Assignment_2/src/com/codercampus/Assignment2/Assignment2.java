package com.codercampus.Assignment2;

import java.util.Scanner;
import java.util.Random;

public class Assignment2 {
	public static void main(String[] args) {
		int guessNum;
		int generatedNum;
		int count = 0;

		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();

		generatedNum = randomNumber.nextInt(101);

		System.out.println(generatedNum);
		System.out.print("Pick a number between 1 and 100: ");

		while (count < 5) {
			guessNum = keyboard.nextInt();

			if (guessNum < 1 || guessNum > 100) {
				System.out.print("Your guess is not between 1 and 100, please try again: ");
				System.out.print("\nPick a number between 1 and 100: ");
			} else if (guessNum == generatedNum) {
				System.out.println("CONGRATULATIONS! ");
			} else if (guessNum > generatedNum) {
				if (count == 4) {
					break;
				}
				System.out.print("Please pick a lower number: ");
				System.out.print("\nPick a number between 1 and 100: ");
				count++;
			} else if (guessNum < generatedNum) {
				if (count == 4) {
					break;
				}
				System.out.print("Please pick a higher number: ");
				System.out.print("\nPick a number between 1 and 100: ");
				count++;
			}
		}
		System.out.println("\n\nYou lose!");
		System.out.println("The number to guess was: " + generatedNum);
	}
}