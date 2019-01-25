import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {

		// These are the moves the user makes
		String playerMove;

		// These are the moves the computer makes
		String computerMove = "";
		// Randomly generated number mapped to the computer's move
		int computerInt;

		Scanner scan = new Scanner(System.in);
		Random generator = new Random();

		// These are the valid strings the user can input
		String Rock;
		String Paper;
		String Scissors;

		// Invite user to play
		System.out.println("Hey! Let's play Rock Paper Scissors.");
		System.out.println("Please enter your move as R for Rock, P for Paper, and S for Scissors.");
		System.out.println("Good Luck!");

		System.out.println();

		// Generate computer's move (0,1,2)
		computerInt = generator.nextInt(3) + 1;

		// Translate computer's randomly generated move to string

		if (computerInt == 1)
			computerMove = "Rock";
		else if (computerInt == 2)
			computerMove = "Paper";
		else if (computerInt == 3)
			computerMove = "Scissors";

		// Get player's move from input
		System.out.println("Make your move: ");
		playerMove = scan.next();

		// Translate player's move to input to "Rock" string
		if (playerMove == "r" || playerMove == "R") {
			playerMove = "Rock";
		}

		// Translate player's move to input to "Paper" string
		else if (playerMove == "p" || playerMove == "P") {
			playerMove = "Paper";
		}

		// Translate player's move to input to "Scissors" string
		else if (playerMove == "s" || playerMove == "S") {
			playerMove = "Scissors";
		}

		// Message that every other input is invalid
		boolean invalidMove = false;
		if (!playerMove.equals("R") && !playerMove.equals("P") && !playerMove.equals("S")) {
			System.out.println("Invalid move. Try again.");
			invalidMove = true;
		}

		while (invalidMove) {
			System.out.println("Please enter your move as R for Rock, P for Paper, and S for Scissors.");
			System.out.println("Make your move: ");
			playerMove = scan.next();
			if (playerMove.equals("R") || playerMove.equals("P") || playerMove.equals("S")) {
				invalidMove = false;
			}
		}
		
		// Translate player's move to input to "Rock" string AGAIN
				if (playerMove == "r" || playerMove == "R") {
					playerMove = "Rock";
				}

				// Translate player's move to input to "Paper" string AGAIN
				else if (playerMove == "p" || playerMove == "P") {
					playerMove = "Paper";
				}

				// Translate player's move to input to "Scissors" string AGAIN
				else if (playerMove == "s" || playerMove == "S") {
					playerMove = "Scissors";
				}
		

		// Show computer's move
		System.out.println("Computer's move is: " + computerMove);

		// Figure out the winner using nested conditional statements.
		// Player move and Computer move are the same
		if (playerMove.equals(computerMove)) {
			System.out.println("It's a tie!");
		}

		// Player move is rock
		else if (playerMove.equals("R")) {
			if (computerMove.equals("Scissors"))
				System.out.println("Rock crushes scissors. You win!");
			else if (computerMove.equals("Paper"))
				System.out.println("Paper covers rock. You lose.");
		}

		// Player move is paper
		else if (playerMove.equals("P")) {
			if (computerMove.equals("Scissors"))
				System.out.println("Scissors cut paper. You lose.");
			else if (computerMove.equals("Rock"))
				System.out.println("Paper covers rock. You win!");
		}

		// Player move is scissors
		else if (playerMove.equals("S")) {
			if (computerMove.equals("Paper"))
				System.out.println("Scissors cut paper. You win!");
			else if (computerMove.equals("Rock"))
				System.out.println("Rock breaks scissors. You lose.");
		}
		scan.close();
	}
}
