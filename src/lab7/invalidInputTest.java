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
		String[] food = { "Chesse Burger's", "Steak", "Spagetti", "Pot Roast" };

		// Common town
		String city = "Detroit, MI";
		int choice = 0;
		String option;
		String cont = "y";

		do{
		System.out.println("Please enter a number between 1-4: ");
		choice = input.nextInt();
		input.nextLine();
		
		switch (choice) {
		case 1:
			System.out.println("What do you want to know about " + people[0] + '?' );
		System.out.println("Hometown or Favorite Food");
		option = input.nextLine();
		if (option.equalsIgnoreCase("hometown")) {
			System.out.println(people[0] +'s' + " hometown is " + city);
		} else if (option.equalsIgnoreCase("favorite food")) {
			System.out.println(people[0]+'s' + " favorite food is " + food[0]);
		} 
		break;
		
		case 2: 
			System.out.println("What do you want to know about " + people[1] + '?' );
		System.out.println("Hometown or Favorite Food");
		option = input.nextLine();
		if (option.equalsIgnoreCase("hometown")) {
			System.out.println(people[1] +'s' + " hometown is " + city);
		} else if (option.equalsIgnoreCase("favorite food")) {
			System.out.println(people[1]+'s' + " favorite food is " + food[1]);
		} 
		break;
		
		case 3: 
			System.out.println("What do you want to know about " + people[2] + '?' );
		System.out.println("Hometown or Favorite Food");
		option = input.nextLine();
		if (option.equalsIgnoreCase("hometown")) {
			System.out.println(people[2] +'s' + " hometown is " + city);
		} else if (option.equalsIgnoreCase("favorite food")) {
			System.out.println(people[2]+'s' + " favorite food is " + food[2]);
		} 
		break;
		
		case 4: 
			System.out.println("What do you want to know about " + people[3] + '?' );
		System.out.println("Hometown or Favorite Food");
		option = input.nextLine();
		if (option.equalsIgnoreCase("hometown")) {
			System.out.println(people[3] +'s' + " hometown is " + city);
		} else if (option.equalsIgnoreCase("favorite food")) {
			System.out.println(people[3]+'s' + " favorite food is " + food[3]);
		}
		}
		System.out.println("Would you like to continue? (Y/N)");
		cont = input.nextLine();
		} 
		while (cont.equalsIgnoreCase("y"));
		System.out.println("Goodbye Nosey! ");
	}
}
