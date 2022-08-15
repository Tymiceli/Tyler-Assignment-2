package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {

		// Variables
		int x;
		int guess;
		boolean answerGuess = false;

		// Game start line
		System.out.println("Guess a number between 1 and 100");
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		// Logic and while loop
		while (!answerGuess) {

			x = random.nextInt(100) + 1;
						
			for (int attempts = 0; attempts < 5; attempts++) {

				guess = sc.nextInt();

				if (guess < 1 || guess > 100) {
					System.out.println("Your guess is not between 1 and 100, please try again.");
					attempts--;
				}
				if (guess != x) {

					if (guess > x && guess >= 1 && guess <= 100) {
						System.out.println("Please pick a lower number");
					}
					if (guess < x && guess >= 1 && guess <= 100) {
						System.out.println("Please pick a higher number");
					}
				}
				if (attempts == 4 && guess != x) {
					System.out.println("You lose! The number to guess was " + x);
					answerGuess = true;
					break;
				}
				if (guess == x) {
					System.out.println("You win!");
					answerGuess = true;
					break;
				}
			}
		}
		sc.close();
	}
}
