package Com;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class NumberGame {
	
	static Scanner sc = new Scanner(System.in);
	//set the maximum number of attempts
	static int Max_Attempts = 5;
	static int attempts;
	static int randomNumber;
	static int UserGuess;
	static int totalPoints;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean playAgain = true;
		gameRound();
		while(playAgain) {
			//Calling the method which is having the game logic
			gameRound();
			
			System.out.println("Do you want to play again? (yes/no): ");
			//Converting user choice to lower case to avoid the casing errors.
			
			String playAgainChoice = sc.nextLine().toLowerCase();
			
			playAgain = playAgainChoice.equals("yes");
			
			//totalScore();
			
			System.out.println("Your total score for playing this game is: " + totalPoints);
			continue;
		}
		System.out.println("Thanks for playing.");
		
	
		
	}
		


	//Extracted the game logic to gameRound method
	private static void gameRound() {
		
		randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
		
System.out.println("Random Number: " + randomNumber);
		
		System.out.println("Hello User Welcome! Enter your name:");
		String name = sc.nextLine();
		System.out.println("Hi!" + name + " guess the generated random number between 1 to 100: ");
		//attempts=0;
		
		while(attempts < Max_Attempts) {

			try {
		UserGuess = Integer.parseInt(sc.nextLine());
		System.out.println(UserGuess);
		
		if(UserGuess == randomNumber) {
			
			System.out.println("Congratulations, you guessed correctly!");
			totalScore();
			break;
			
		}
		
		else {
			attempts++;
			System.out.println("Wrong guess, try again. Attempts Left: " + (Max_Attempts-attempts));	
			
			
		}
		
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid input. Please enter a valid Number.");
				continue;
			}
			break;
	
		}
		
		if(Max_Attempts == attempts) {
		System.out.println("Sorry, you have reached the maximum number of attempts. The Correct Number is: " + randomNumber);
		}
	
		}
		
		public static void totalScore() {
	
				totalPoints += (Max_Attempts-attempts)*20;	
		
	}
}
