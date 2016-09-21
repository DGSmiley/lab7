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

		// Common town and 
		String city = "Detroit, MI";
		
		//declaring variables
		int choice;
		String option;
		String cont = "y";

		//do while loop for continuation
		do{
			
		System.out.print("Please enter a number between 1-4: ");
		choice = input.nextInt()-1;
		input.nextLine();
		System.out.println("That person is " + people[choice] + "," + " What do you want to know about " + people[choice] + "?");
		System.out.println("Please enter Hometown or Favorite Food");
		option = input.nextLine();
		if (option.equalsIgnoreCase("hometown")) {
			System.out.println(people[choice] +'s' + " hometown is " + city);
		} else if (option.equalsIgnoreCase("favorite food")) {
			System.out.println(people[choice]+'s' + " favorite food is " + food[choice]);
		}
		// Continue option
				System.out.println("Would you like to continue? (Y/N)");
				cont = input.nextLine();
				} 
				while (cont.equalsIgnoreCase("y"));
				System.out.println("Goodbye Nosey! ");
	}
	}

