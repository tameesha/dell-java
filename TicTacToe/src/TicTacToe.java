
// Import this Java program to read data (input from the user) using the Scanner class
import java.util.Scanner;

public class TicTacToe {

	// Public static variables of varying types that belong to the TicTacToe class
	public static char[][] board;
	public static Scanner reader = new Scanner(System.in);
	public static int movesPlayed = 0;

	
	// Let's modify the 'main' method so that it initializes a couple of objects
	public static void main(String[] args) {
		board = new char[3][3];
		char player = 'X'; 

		System.out.println("Let's play tic-tac-toe!");
		System.out.println("You be Xs and I'll be Os");

		printBoard();

		//Create a new integer array called 'move' that holds 2 items
		int[] move = new int[2];

		ticTacToe(player, move);
	}

	public static void printBoard() {
		System.out.println("\n  0   1   2");
		System.out.println("0 " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("  ---------");
		System.out.println("1 " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("  ---------");
		System.out.println("2 " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + "\n");
	}

	public static void ticTacToe(char player, int[] move) {
		// Ask user for move
		receiveInput(player, move);

		// Check for legal move
		if (isMoveLegal(move)) {
			board[move[0]][move[1]] = player;
			printBoard();

			// Check for win or tie
			if (checkForWin(player)) {
				winner(player);
			} else if (movesPlayed == 8) {
				tie();
			} else {
				movesPlayed++;
				player = player == 'X' ? 'O' : 'X';

				System.out.println("It's " + player + "'s turn.");
				ticTacToe(player, move);
			}

		} else {
			System.out.println(board[move[0]][move[1]] + " is already in that position. Choose another:");
			ticTacToe(player, move);
		}
	}

	public static void receiveInput(char player, int[] move) {
		// Ask for move
		System.out.println("Player " + player + "'s move. \n Enter a row (0 - 2):");

		// Take input from user
		int row = reader.nextInt();
		System.out.println("Enter a column (0 - 2):");
		int column = reader.nextInt();

		// Store user's move in array
		move[0] = row;
		move[1] = column;
	}

	public static boolean isMoveLegal(int[] move) {
		int row = move[0];
		int col = move[1];
		if (board[row][col] == 'X' || board[row][col] == 'O') {
			return false;
		} else {
			return true;
		}
	}

	public static boolean checkForWin(char player) {
		if (verticalWin(player)) {
			return true;
		} else if (horizontalWin(player)) {
			return true;
		} else if (diagonalWin(player)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean verticalWin(char player) {
		for (int i = 0; i < board.length; i++) {
			if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
				return true;
			}
		}

		return false;
	}

	public static boolean horizontalWin(char player) {
		for (int i = 0; i < board.length; i++) {
			if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
				return true;
			}
		}

		return false;
	}

	public static boolean diagonalWin(char player) {
		if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
			return true;
		} else if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
			return true;
		} else {
			return false;
		}
	}

	public static void tie() {
		System.out.println("Tie!");
		reader.close();
	}

	public static void winner(char player) {
		System.out.println(player + " wins!");
		reader.close();
	}

}