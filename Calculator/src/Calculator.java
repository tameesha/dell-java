import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Get first number
		System.out.println("Please enter the first number: ");
		int num1 = input.nextInt();
		
		// Get second number
		System.out.println("Please enter the second number: ");
		int num2 = input.nextInt();
		
		// Add the numbers together
		int add = num1 + num2;
		// Print out sum
		System.out.println("The sum of those numbers is: " +add);
		
		// Subtract the second number from the first
		int subtract = num1 - num2;
		// Print out subtraction
		System.out.println("The difference between those numbers is: " +subtract);
				
		// Multiply the numbers
		int multiply = num1 * num2;
		// Print out multiplication
		System.out.println("The product of those numbers is: " +multiply);
				
		// Divide the numbers
		int divide = num1 / num2;
		// Print out quotient
		System.out.println("The quotient of those numbers is: " +divide);
		
		input.close();
	}

}
