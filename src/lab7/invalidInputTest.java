package lab7;

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
		int choice;
		System.out.println("Please enter a number between 1-20: ");
		choice = input.nextInt();

		if (choice <= 5 ) {
			System.out.println(people[0]); 
		} else if (choice <= 10) {
			System.out.println(people[1]);
		} else if (choice <= 15) {
			System.out.println(people[2]);
		} else if (choice <= 20) {
			System.out.println(people[3]);
		} else  {
			System.out.println("Try again, enter a number between 1-20 this time."); 
		} 
		
	
	}
}
