package loops;
import java.util. *; 

public class OddEven {
	public static void main(String args []) {
		Scanner input= new Scanner(System.in); 
	
		System.out.println("Enter first Number:");
		int firstNum= input.nextInt(); 
		System.out.println("Enter second Number:");
		int secondNum=input.nextInt();
		int i=firstNum; 
		
		if(firstNum<secondNum) {
			
		
			System.out.print("The Even number is :");
			int sumEven=0;
			while(i<=secondNum) {
				if(i%2==0) {
					System.out.printf(" %d", i);
					sumEven+=i; 
				}
				i++; 
			
			}
			System.out.println("\nThe sum of even number is = "+sumEven);
			System.out.print("Odd Number is:"); 
			int sumOdd=0;
			int j=firstNum;
			while(j<=secondNum) {
				if(j%2!=0) {
					System.out.printf(" %d", j);
					sumOdd+=j; 
				}
				j++; 
				
			}
			
			System.out.println("\nThe sum of odd number is = "+sumOdd);
		}else {
			System.out.print("First number must be smaller "
					+ "than the second number ");
		}//end else
		input.close(); 
	
	}//end main
}//end class

		
