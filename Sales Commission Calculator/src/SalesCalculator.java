
import java.util.*; 

public class SalesCalculator {

	public static void main(String[] args) {
		
        int totalSales=0;
		int sale; 
		double salary;
		Scanner scan=new Scanner(System.in); 
	
		
		System.out.print("Enter total value of sold item or -1 to quit: ");
		sale=scan.nextInt();
		while(sale !=-1) {
			
			totalSales += sale;
			
			System.out.print("\nEnter total value of sold item or -1 to quit: ");
			sale=scan.nextInt();
			totalSales += sale;	
			
			
		}
		if(sale!=0) {
			salary=200+(totalSales * ((double) 9/100)) ;
			System.out.printf("\nSalar is : %.2f",salary);
			
		}
		
	
		
			
		
		

	}

} 