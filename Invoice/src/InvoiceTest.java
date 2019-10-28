
public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice1= new Invoice("5996","Floppy Disk 1.2 MB",10,50.0);
		System.out.printf("the invoice Amount for %s, is %.2f",invoice1.getDescription(),invoice1.getInvoiceAmount());

	}

}
