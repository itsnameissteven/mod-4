package userInputCalculations;
import java.util.Scanner;

public class UserInputCalculations {

	public static void main(String[] args) {
		int count = 0;
		double total = 0.0;
		double average;
		double maximumInput = 0.0;
		double minimumInput = 0.0;
		double interest;
		
		// Try with resources to automatically close scanner
		try(Scanner scnr = new Scanner(System.in)) {
			// Run the loop five times to get 5 user inputs
			while(count < 5) {
				// Ternary for accurate print message.
				String stringContent = count == 0 ? "a" : "another";
				System.out.print("Enter " + stringContent + " number: ");
				
				
				while(!scnr.hasNextDouble()) {
					System.out.println("Please enter a valid number");
					scnr.next();
				}
				double userInput = scnr.nextDouble();
				
				total += userInput;
				
				// On the first iteration set the min and max number and move to
				// the next loop
				if(count == 0) {
					maximumInput = userInput;
					minimumInput = userInput;
					count++;
					continue;
				}
				
				if(userInput > maximumInput) {
					maximumInput = userInput;	
				}
				
				if(userInput < minimumInput) {
					minimumInput = userInput;
				}
				
				// Update count
				count++;	
			}
			
			average = total / count;
			interest = total * .20;
			
			System.out.println("Total: " + total);
			System.out.println("Average: " + average);
			System.out.println("Maximum: " + maximumInput);
			System.out.println("Minimum: " + minimumInput);
			System.out.println("Interest at 20%: " + interest);	
		}
	}

}
