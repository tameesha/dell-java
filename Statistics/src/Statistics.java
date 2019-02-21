import java.util.*;

public class Statistics {

	public static void main(String[] args) {

		// Used to read input from the user
		Scanner reader = new Scanner(System.in);

		// Used to print out text to the user
		System.out.println("Please enter a list of numbers.");

		// nextLine() reads the whole String including blank spaces
		String submittedNumbers = reader.nextLine();

		// close the reader
		reader.close();

		// convert the string to an string array and split it w/commas
		String[] stringArray = submittedNumbers.split(",");

		// print out the users input
		System.out.println(stringArray);

		// Print out the count of the number of values the user input
		System.out.println("You entered " + stringArray.length + " numbers.");

		// Print out the minimum value in the array
		System.out.println("Minimum is " + returnMin(stringArray));

		// Print out the maximum value in the array
		System.out.println("Maximum is  " + returnMax(stringArray));

		// Print out the average value of the array
		System.out.println("Average is " + returnAverage(stringArray));

		// Print out the sum of the values in the array
		System.out.println("Sum is " + returnSum(stringArray));
	}

	// Parse the string array, convert each value to int, and loop through to return the minimum value
	public static int returnMin(String[] array) {
		int minimum = 0;

		for (int i = 0; i < array.length; i++) {
			int currentNum = Integer.parseInt(array[i]);
			if (i == 0 || currentNum < minimum) {
				minimum = currentNum;
			}
		}

		return minimum;
	}

	// Parse the string array, convert each value to int, and loop through to return the max value
	public static int returnMax(String[] array) {
		int maximum = 0;

		for (int i = 0; i < array.length; i++) {
			int currentNum = Integer.parseInt(array[i]);
			if (i == 0 || currentNum > maximum) {
				maximum = currentNum;
			}
		}

		return maximum;
	}

	// Parse the string array, convert each value to float, and loop through to return the avg value
	public static float returnAverage(String[] array) {
		float total = 0;

		for (int i = 0; i < array.length; i++) {
			total += Integer.parseInt(array[i]);
		}

		return total / array.length;
	}

	// Parse the string array, convert each value to int, and loop through to return the sum total
	public static int returnSum(String[] array) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total += Integer.parseInt(array[i]);
		}

		return total;
	}

}