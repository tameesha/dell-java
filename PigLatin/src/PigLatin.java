import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Ask user for a word
		System.out.println("Enter a word to translate it into Pig Latin.");

		// This variable holds the word the user inputs and converts it to a string
		String userWord = scan.next();

		// Let's ensure legibility by converting the user's input into lower case
		userWord = userWord.toLowerCase();

		// This is the variable that holds the user's word translated into Pig Latin
		String translatedWord = "";

		// Let's assume there are no vowels in userWord and set the value of int to 0
		int flag = 0;

		// Let's iterate through the string to find the first vowel as defined by x.
		for (int i = 0; i < userWord.length(); i++) {
			char x = userWord.charAt(i);
			if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
				/*
				 * Make the translation by creating a substring of all the letters up to the
				 * first vowel moving these to the end of the original string, and appending
				 * 'ay' after that.
				 */
				translatedWord = userWord.substring(i) + userWord.substring(0, i) + "ay";

				// Change flag to 1 to indicate userWord has been translated and break the loop.
				flag = 1;
				break;

			}
		}

		/*
		 * if there are no vowels in userWord, flag remains 0 and the word isn't
		 * translated. To translate a vowel-less userWord, append 'ay' to the end.
		 */
		if (flag == 0) {
			translatedWord = userWord + "ay";
		}

		// Show the user's word translated into Pig Latin
		System.out.println("That word translated into Pig Latin is: " + translatedWord);
		
		scan.close();

	}

}
