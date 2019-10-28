
public class Account 
{

	// create an instance variable 
	private String name; 
	private double balance; // to hold balance of the bank 
	
	//constructor that initialize the name and the balance 
	public Account(String name, double balance) {
		this.name=name; 
        if(balance>0.0) {
        	this.balance=balance;  
        	
        }
		
	}// end of constructor
	public void deposit(double amount) {
		balance= balance+amount; // add the deposited amount to the balance
		
	}// end of deposit method 
	public double withdraw(double amount) {
		if(amount>balance) {
			System.out.print("Withdraw amount exceeded account balance ");
		}
		balance=balance-amount;  
		return balance;  
	}
	
	// method that returns the balance of the account 
	public double getBalance() {
		return balance; 
	}
	// end of getBalance 
	
	// method that sets name 
	public void setName(String name) {
		this.name=name; // store the name 
	}// end of setName 
	
	// method that gets the name 
	public String getName() {
		return name; 
	}// end of the getName
	
} // end of class 
	

