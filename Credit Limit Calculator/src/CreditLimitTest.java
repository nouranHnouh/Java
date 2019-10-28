import java.util.*; 
public class CreditLimitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int accountNo, charges, credit, balance, creditLimit;
		char customer='y';
		Scanner scan=new Scanner(System.in);
		CreditLimitCalculator creditCalculator= new CreditLimitCalculator(2345,3000,20,80,100);
		
		
		while(customer !='n') {
			//ask user for customer info
			System.out.print("Enter accountNo: ");
			accountNo= scan.nextInt();
			creditCalculator.setAccountNumber(accountNo);
			
			System.out.print("Enter balance at the begining of the month: ");
			balance= scan.nextInt();
			creditCalculator.setBalance(balance);
			
			System.out.print("Enter total item charged this month : ");
			charges= scan.nextInt();
			creditCalculator.setTotalCharges(charges);
			
			System.out.print(" Enter total credits apply to the account : ");
			credit= scan.nextInt();
			creditCalculator.setTotalCredits(credit);
			
			System.out.print("Enter credit limit:  ");
			creditLimit= scan.nextInt();
			creditCalculator.setBalance(creditLimit);
			
			//get customer info
			System.out.printf("Acoount Number is: %d%n", creditCalculator.getAccountNumber());
			System.out.printf("Balance is: %d%n", creditCalculator.getBalance());
			System.out.printf("Total item charges are: %d%n", creditCalculator.getTotalCharges());
			System.out.printf("Total Credits applied is: %d%n", creditCalculator.getTotalCredits());
			if(creditCalculator.creditLimit()) {
				System.out.print("Credit limit exceeded.");
				
			}
			System.out.printf("\nTotal Credits applied is: %d%n", creditCalculator.getTotalCredits());
			System.out.printf("New Balance Calculated: %d%n", creditCalculator.calcNewBalance());
			
			//calculate for another customer credit 
			System.out.println("Do you want to calculate for another credit(y/n): ");
			customer=scan.next().charAt(0); 
		
		}//end while loop

	}//end main

}//end class
