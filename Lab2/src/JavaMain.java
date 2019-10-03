/*
 * JavaMain ask users for two number inputs
 * and output their sum 
 */

import java.util.Scanner; 
/**
 * program to calculate the sum of two numbers
 * @author nourannouh
 *
 */
public class JavaMain {
	public static void main(String args[]) {
		
		int firstNum; // number1
		int secondNum; // number2
		int sum=0; // sum of two numbers
		
		//create new object of class scanner to input to
		//command window 
		Scanner scanner= new Scanner(System.in);  
		System.out.println("This program reads two numbers, finds the sum and displays it.");
		//ask user to enter first number
		System.out.print("Enter the first number: " );
	   
		//ask user to enter second number 
		firstNum=scanner.nextInt();
		System.out.print("Enter the second number: " );
		secondNum=scanner.nextInt();
		
		//calculate sum of two numbers
		sum=firstNum+secondNum; 
		
		//print the sum of two numbers 
		System.out.printf("\nsum of %d and %d is %d", firstNum,secondNum,sum); 
		scanner.close();  // close scanner 
	 

		
		
		
    }//end the main
}//end class 

