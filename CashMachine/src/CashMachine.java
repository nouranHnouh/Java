import java.util.*;


public class CashMachine {
	Scanner consoleInput=new Scanner(System.in);
	//Instance variables 
	private int itemCount;
	private double tax;
	private double sum;
	private String receipt;
	
	//constructor to initialize instance variables 
	public CashMachine (double tax) {
		itemCount=0;
		this.tax=tax;
		sum=0.0;
		receipt=" ";
	}//end constructor 
	
	//get item name 
	public String getOneStringInput(String input) {
		System.out.print(input);
		String itemName=consoleInput.next(); 
		return itemName;  
	
	}//end getOneStringInput method 
	
	//get item price 
	public double getOneDoubleInput(String input) {
		
		System.out.print(input);
		double itemPrice=consoleInput.nextDouble();
		String d= String.format("%.2f" ,itemPrice);
		return Double.parseDouble(d); 
		
	
	}//end getOneDoubleInput method 
	
	//get the itemCount 
	public int getItemCount() {
		return itemCount; 
		
	}//end getItemCount 
	
	//calculate tax for the items 
	public double calculateTax() {
		double calcTax=0.0;
		calcTax=sum*tax;
		return calcTax; 
		
	}//end calculateTax method
	
	public double calculateTaxPlusSum() {
		  return sum+calculateTax();
		   
		 
	}
	
	public boolean processMenu() {
		double oneDouble=getOneDoubleInput("Action>>");
		if (oneDouble==1) {
			purchaseItem(); 
		}else if(oneDouble==2) {
			printReceipt();
			
		}else {
			return false;
			
		}
		
	
		return true;
	}
	
	public void purchaseItem() {
		String itemName; 
	    itemName=getOneStringInput("item name(no space)>>");
		double itemPrice;
		itemPrice=getOneDoubleInput("item price>>");
		itemCount++; 
		sum=sum+itemPrice;
		receipt=receipt+String.format("%-15s$%.2f%n",itemName,itemPrice); 
		
		
	}
	
	public void printMenu() {
		System.out.println();
		System.out.println("(1 Purchase Item ");
		System.out.println("(2 Print Receipt ");
		System.out.println("(3 Quit ");
		System.out.println(); 
		
	}
	
	public void printReceipt() {
		if(itemCount==0) {
			System.out.print("Empty");
		}else {
			System.out.print("Receipt for 3 items:");
			System.out.print("\n\n"+receipt);
			double total=calculateTaxPlusSum();
			System.out.printf("\n\nTax:$%15.2f%nTotal:$%13.2f ",tax,total);
			System.out.println(); 
		}
		
		
	}

}//end class CashMachine



