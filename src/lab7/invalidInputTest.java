package lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class invalidInputTest {

	public static void main(String[] args) {
		// header
		System.out.println("Welcome you nosey mortal. Which person would you like to know more about? ");
		Scanner input = new Scanner(System.in);

		// Array for people and food
		String[] people = { "David", "Dante", "Damien", "Martin" };
		String[] food = { "Chesse burger", "Steak", "Spagetti", "Pot Roast" };

		// Common town
		String hometown = "Detroit, MI";
		int choice = 0;
		String option;

		do {
			System.out.println("Please enter a number between 1-20: ");
			choice = input.nextInt();
			{
				//System.out.println("Invalid entry: Try Again");
			}
			if (choice <= 5) {
				System.out.println("What do you want to know about " + people[0]);
			} else if (choice <= 10) {
				System.out.println("What do you want to know about " + people[1]);
			} else if (choice <= 15) {
				System.out.println("What do you want to know about " + people[2]);
			} else if (choice <= 20) {
				System.out.println("What do you want to know about " + people[3]);
			} else {
				System.out.println("How about we try this again");	
				continue;
				//choice = input.nextInt();	
				 }			
		} while (choice > 20);		
		System.out.println("Home Town or Favorite Food? ");
		option = input.nextLine();
	}
}
