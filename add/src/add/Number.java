package add;
import java.lang.*; 
import javax.swing.JOptionPane; 
//import java.util.Scanner;

public class Number {
	
	//begin execution of java application 
	public static void main(String[]args) 
	{
		
		// create new SCanner object to obtain input from 
		// command window 
		
		// define variables
		String numInput;
		String numInput2;
		int sum=0; // initialize sum to zero 
		
		numInput=JOptionPane.showInputDialog("Enter first Number");
		numInput2=JOptionPane.showInputDialog("Enter Second Number");

	
		
		//calculate the sum
		sum=Integer.parseInt(numInput)+Integer.parseInt(numInput2); 
		
		//display message
		String Message=String.format("the sum of the two numbers is: %s",Integer.toString(sum)); 
		JOptionPane.showMessageDialog(null, Message); 
	}// end main 

}
