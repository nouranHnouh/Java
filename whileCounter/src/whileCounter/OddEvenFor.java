package whileCounter;
import java.util. * ;
public class OddEvenFor {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in); 
		System.out.println("Enter first Number:");
		int firstNum= input.nextInt(); 
		System.out.println("Enter second Number:");
		int secondNum=input.nextInt();
		int i;
		System.out.print("The Even number is :");
		int sumEven=0;
		if(firstNum<secondNum) {
			for(i=firstNum;i<=secondNum;i++) {
				if(i%2==0) {
					System.out.printf(" %d", i);
					sumEven+=i;
					
					
				
				}//end if 
				
			
			
			}//end for
			System.out.println("\nThe sum of even number is = "+sumEven);
			System.out.print("Odd Number is:"); 
			int sumOdd=0;
			for(int j=firstNum; j<=secondNum;j++) {
				if(j%2!=0) {
					System.out.printf(" %d", j);
					sumOdd+=j;
				}
				
		}//end for 
			
		System.out.println("\nThe sum of odd number is = "+sumOdd);
		}else {
			System.out.print("First number must be smaller "
					+ "than the second number ");
		}//end else		
				
				
		//close scanner 		
		input.close(); 	
		
	}//end main
		
	
}//end class
	

