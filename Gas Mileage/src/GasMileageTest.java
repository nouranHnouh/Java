import java.util. *; 
public class GasMileageTest {

	public static void main(String[] args) {
		GasMileage mile=new GasMileage();
		Scanner scan=new Scanner(System.in);
		int miles;
		int gallons;
		char s='y';

		while(s !='n') {
			System.out.print("Enter miles for the driver : ");
			miles=scan.nextInt();
			System.out.print("Enter gallon : ");
			gallons=scan.nextInt();
			
			System.out.printf(" The miles per gallons "
					+ "for each trip is %.2f\n ",mile.TripMileage(miles, gallons));
			
			System.out.print("Do you want to add a trip? (y/n): ");
            
			//get the first character from the user 
			s = scan.next().charAt(0);  
			
			
		}
		
		System.out.printf("the miles per gallons "
				+ "for total trips is %.2f ",mile.totalTripMileage());
		scan.close();
		
		

	
	}//end main

}// end class GasMileageTest
