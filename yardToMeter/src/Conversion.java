/**
 * this program convert yard to meter 
 */
import java.util.Scanner; 
import java.text.*;
public class Conversion {
	Scanner scan = new Scanner (System.in);
	private double valueInYard;
	
	// default constructor
	public Conversion() {
		
		
	}//end constructor 
	
	
	//take input from user
	
	public void inputYard() {
		System.out.print("Enter Amount in Yard >> ");
		valueInYard=scan.nextDouble(); 
	
	}//end inputYard
	
	public double yardToMeter() {
		double meter= valueInYard/1.0936;
		DecimalFormat decimal=new DecimalFormat("#.##");
		return(Double.parseDouble(decimal.format(meter)));
		
	}// end yerdTometre
	
	//display yard to meter
	public void display() {
		System.out.println(valueInYard+" yard is " + yardToMeter()+" meter ");
	}
	
	//test program 
	public static void main(String [] args) {
		Conversion conversion= new Conversion();
		//ask user for input
		conversion.inputYard();
		//covert yard to meter
		conversion.yardToMeter();
		//display output converted 
		conversion.display(); 
	
	
	}//end main
	

}//end class 