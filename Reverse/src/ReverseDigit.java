import java.util.*;
public class ReverseDigit {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Digit of Integer");
		int digit=input.nextInt();
		int i;
		int reverse=0; 
		int num=0; 
		
		//i/=10 remove digit from its place 
		for(i=digit;i!=0;i/=10) {
			num=i%10; // give us the last digit 
			reverse=reverse*10 +num; //append with last digit to the first place  
			
		}
		
		System.out.printf("Reversed Number: %d", reverse);
		input.close();
		
	}//end main

}//end class
