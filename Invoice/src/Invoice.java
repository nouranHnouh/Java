/*
 * Invoice Class used by Hardware store used to represent
 *  an invoice for an item sold at the store
 *  it has four instance variables 
 *  part_num:part_number
 *  description: part description 
 *  quantity: quantity of the item being purchased 
 *  price: price of the item 
 */ 
public class Invoice {
	private String part_num; 
	private String description; 
	private int quantity; 
	private double price; 
public Invoice(String part_number,String description,
			int quantity, double price)
{
	this.part_num=part_number;
	this.description=description; 
	this.quantity=quantity;
	this.price=price;
	
	
}// end of constructor 

// function set to set the part number 
public void setPartNumber(String part_number) {
	
	part_num= part_number; 
}// end setPartNumber method 

//set method description
public void setDescription(String description) {
	this.description=description;  
	
}// end setDescription 

//setQuantity to set quantity 
public void setQuantity(int quantity) {
	this.quantity=quantity; 
	
}//end setQuantity 

public void setPrice(double price) {
	this.price=price;
}//end of setPrice

//return the part number
public String getPartNum() {
	return part_num; 
}//end of getPartNum

// return instance variable description
public String getDescription() {
	return description; 
}//end of getDescription 

// return quantity of the part 
public int getQuantity() {
	return quantity; 
}// end getQuantity 

//return price of the part 
public double getPrice() {
	return price; 
}//end of getPrice 

//method getInvoiceAmount that calculates the invoice amount 
public double getInvoiceAmount() {
	double invoiceAmount; 
	if(quantity<0) {
		invoiceAmount=0.0; 
		
	}
	invoiceAmount=quantity*price;
	return invoiceAmount; 
}//end of getInvoiceAmount 

}// end of class Invoice  
