
/**
 * Java application that determines
 * whether any of several department customers 
 * has exceeded the credit limit on charge account 
 * 
 *
 */
public class CreditLimitCalculator {
	private int accountNumber;
	private int balance ;
	private int totalCharges;
	private int totalCredits;
	private int creditLimit; 
	
	//constructor to initialize 
	//instance variables
	public CreditLimitCalculator(int accountNumber,
			int balance,int totalCharges,
			int totalCredits,int creditLimit) 
	
	{
		this.accountNumber=accountNumber;
		if(balance>0) {
			this.balance=balance;
		}
		this.totalCharges=totalCharges;
		this.totalCredits=totalCredits;
		this.creditLimit=creditLimit; 
	
	}//end of constructor 
	
	//set account number for the customer 
	public void setAccountNumber(int accountNumber) 
	{
		this.accountNumber=accountNumber;
		
	}//end setAccountNumber
	
	//get account number
	public int getAccountNumber() {
		return accountNumber;
	}//end getAccountNumber method 
	
	//set balance for the customer 
		public void setBalance(int balance) 
		{
			this.balance=balance;
			
		}//end setBalance
		
		//get account number
		public int getBalance() {
			return balance;
		}//end getBalance method 
		
		
		public void setTotalCharges(int itemCharge) 
		{
			totalCharges= itemCharge;
			
		}//end setBalance
		
		//get account number
		public int getTotalCharges() {
			return totalCharges;
		}//end getBalance method 
		
		public void setTotalCredits(int credits) {
			totalCredits=credits;
		}
		
		public int getTotalCredits() {
			return totalCredits;
		}
		
		public void setCreditLimit(int creditLimit) {
			this.creditLimit=creditLimit;
		}
		
		public int getCreditLimit() {
			return creditLimit;
		}
		
		public int calcNewBalance() {
			int newBalance= getBalance()
					+getTotalCharges()-getTotalCredits();
			return newBalance ; 
			
		}
		
		public boolean creditLimit() {
			if(calcNewBalance()>getCreditLimit()) {
				return false; 
				
				
			} 
				
			return true; 
			
		}//end creditLimit method 
		
		
		
		
		
		
		
	


}//end class 
