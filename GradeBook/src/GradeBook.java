import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

 public class GradeBook {

	//Create static String for the grades
 	static HashMap<String, String> gradeBook = new HashMap<String, String>();
	static HashMap<String, Double> gradePointAverage = new HashMap<String, Double>();

	// Obligatory main method
 	public static void main(String[] args) {
	
 	// Initialize the fields
	inputGrades();
	makeStringArray();
	printGrades();
	}

 	//Store the name + grades for each student
 	public static void inputGrades() {
		Scanner reader = new Scanner(System.in);
		System.out.println("How many students will be added to the grade book?");
		Integer numberOfStudents = reader.nextInt();
		reader.nextLine();
		for (int i=0; i<numberOfStudents; i++) {

 			System.out.println("What is the student's name?");
			String name = reader.nextLine();
			System.out.println("What are " + (name) + "\'s grades separated by a comma?");
			String grades = reader.nextLine();

 			// Add each student's name and grades to HashMap
			gradeBook.put(name, grades);
		}
		reader.close();
	}

 	//Create array of strings out of hash map using the name as the key and the grades as the values
	public static void makeStringArray() {
		String[] listOfStudents = (String[]) gradeBook.keySet().toArray(new String[0]);
		String[] listOfFinalGrades = (String[]) gradeBook.values().toArray(new String[0]);

		//Split each student's grades into separate strings and then convert all into an array of strings
 		for(int i=0; i<listOfFinalGrades.length; i++) {
			String grades = listOfFinalGrades[i];
			String[] stringArray = grades.split(",");

 			//convert array of strings into array of integers
			Integer[] intArray = new Integer[stringArray.length];
		    for (int j = 0; j < intArray.length; j++) {
		        Integer num = Integer.parseInt(stringArray[j]);
		        intArray[j] = num;
		    }

 		    //Figure out the grade point average
		    double sum = 0;
			for (int k=0;k<intArray.length;k++) {
				sum = sum + intArray[k];
			}
			double average = sum / intArray.length;
			gradePointAverage.put(listOfStudents[i], average);
		}

 	}

 	public static void printGrades() {
		String[] listOfStudents = (String[]) gradePointAverage.keySet().toArray(new String[0]);
		Double[] listOfAverages = (Double[]) gradePointAverage.values().toArray(new Double[0]);

 		for (int i = 0; i < listOfStudents.length; i++) {
	        String currentName = listOfStudents[i];
	        double currentAvg = listOfAverages[i];

 	        System.out.println(currentName + "'s grade point average is " + currentAvg);
		}
	}

 }