import java.text.*;
import java.util.*;

public class squareArea {

	public static void main(String[] args) {
		double squareSide=0.0; 
		double area=0.0;
		Scanner scan=new Scanner(System.in); 
		System.out.println(" Enter the size of the square in cm: ");
		squareSide=scan.nextDouble(); 
		scan.close();
		//calculate the area
		area=squareSide*squareSide; 
		DecimalFormat df= new DecimalFormat("#.##"); 
		System.out.printf("the area of a square of side %s cm is %s cm2", 
				df.format(squareSide),df.format(area)); 

	}

}
