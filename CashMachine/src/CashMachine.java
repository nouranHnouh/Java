import java.util.*;
/**
 * cashMachine class ask user for item name 
 * and item price and print receipt for that
 * @author Nouran Nouh
 *
 */

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
		receipt="";
	}//end constructor 
	
	//get item name 
	private String getOneStringInput(String input) {
		System.out.print(input);
		String itemName=consoleInput.next(); 
		return itemName;  
	
	}//end getOneStringInput method 
	
	//get item price 
	private double getOneDoubleInput(String input) {
		
		System.out.print(input);
		double itemPrice=consoleInput.nextDouble();
		return itemPrice; 
		
	
	}//end getOneDoubleInput method 
	
	//get the itemCount 
	private int getItemCount() {
		itemCount++;
		return itemCount; 
		
	}//end getItemCount 
	
	//calculate tax for the items 
	private double calculateTax() {
		double calcTax=0.0;
		calcTax=sum*tax;
		return calcTax; 
		
	}//end calculateTax method
	
	//calculate total sum of the item plus tax
	
	private double calculateTaxPlusSum() {
		  return sum+calculateTax();
		   
		 
	}//end calculateTaxPlusSum method
	
	//process the menu of the user 
	//if user entered one purchase item,
	//if user entered 2 print receipt 
	//else quit 
	public boolean processMenu() {
		double oneDouble=getOneDoubleInput("Action>>");
		if (oneDouble==1) {
			purchaseItem(); 
		}else if(oneDouble==2) {
			printReceipt();
			
		}else {
			return false;
			
		}//end else
		
	
		return true;
	}//end processMenu
	
	//ask user to purchaseItem by
	//entering item name and 
	
	private void purchaseItem() {
		String itemName; 
	    itemName=getOneStringInput("item name(no space)>>");
		double itemPrice;
		itemPrice=getOneDoubleInput("item price>>");
		getItemCount(); //increment count 
		sum+=itemPrice;
		receipt+=String.format("%-15s$%.2f%n",itemName,itemPrice); 
		
		
	}
	
	public void printMenu() {
		System.out.println();
		System.out.println("(1 Purchase Item ");
		System.out.println("(2 Print Receipt ");
		System.out.println("(3 Quit ");
		System.out.println(); 
		
	}
	
	private void printReceipt() {
		if(itemCount==0) {
			System.out.println("\nEmpty");
		}else {
			System.out.print("Receipt for "+ itemCount+ " items:");
			System.out.print("\n\n"+receipt);
			double total=calculateTaxPlusSum();
			
			System.out.printf("\n\n%-15s$%.2f%n%-15s$%.2f ","Tax:",
					tax,"Total:",total);
			System.out.println(); 
		}
		
		
	}

}//end class CashMachine



