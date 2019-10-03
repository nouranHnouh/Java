import java.util.Scanner; // import Scanner class 

// test the account 
public class AccountTest {
	public static void main(String[]args) {
		
		// create new object and assign it to account
		Account account= new Account("Nouran Nouh",50.00); 
		Account account2= new Account("Jane Blue",-7.53); 
		
		// display initial name and Balance
		
		System.out.printf("%s initial balance is: %.2f%n", 
					account.getName(),account.getBalance());
		System.out.printf("%s initial balance is: %.2f%n", 
					account2.getName(),account2.getBalance());
		
		//create Scanner to obtain input from the command window
		Scanner input=new Scanner(System.in); 
		
		//account1:
		System.out.print("Enter the deposite ammount for acount1: ");
		double depositAmount=input.nextDouble(); 
		System.out.printf("%n adding %.2f to account balance%n%n",depositAmount);//output a blank line;
		//deposit amount into account 1
		account.deposit(depositAmount); 
		
		//display the name and the balance stored in object account1 and account2
		System.out.printf("%s balance is %.2f", account.getName(),account.getBalance()); 
		System.out.printf("%n%s balance is %.2f", account2.getName(),account2.getBalance());
		
		//account2:
		System.out.print("\n\nEnter the deposite amount for acount2: ");
		depositAmount=input.nextDouble(); // get input from user for account2 
		System.out.printf("%n adding %.2f to account2 balance%n%n",depositAmount);//output a blank line;
		//deposit amount into account 2
		account2.deposit(depositAmount); 
		

		//display the name and the balance stored in object account1 and account2
		System.out.printf("%s balance is %.2f", account.getName(),account.getBalance()); 
		System.out.printf("%n%s balance is %.2f", account2.getName(),account2.getBalance());
		
		// Test withdraw 
		System.out.print("\nEnter Withdrwal ammount: ");
		double withdrawlAmount=input.nextDouble();
		account.withdraw(withdrawlAmount); 
		System.out.printf("%s balance is %.2f", account.getName(),account.getBalance()); 
		
		
	}//end main

}// end class
