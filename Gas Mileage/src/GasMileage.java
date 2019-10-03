
/**
 * this Java Application is Mileage that keep track 
 * of several trips by asking user for input gallons
 * and miles and calculate and display miles
 * per gallon for each trip and print the combined for each trip
 * @author nourannouh
 *
 */
public class GasMileage {
	private int totalMiles;
	private int totalGallons;
	
	
	//constructor to initialize 
	//instance variables
	public GasMileage() {
		//check that user enter valid values
		totalMiles=0;
		totalGallons=0; 
	}//end constructor 
	
	//method set Miles 
	public void setMile(int mile) {
		totalMiles=mile; 
	}//end setMile method 
	
	//return miles for the driver 
	public int getMiles() {
		return totalMiles;
		
		
	}//end getMile method 
	
	//setGallon method set the gallon used
	public void setGallon(int gallon) {
		totalGallons=gallon;
	
	}// end method setGallon
	
	//return the gallon used by the car 
	public int getGallon() {
		return totalGallons; 
	}//end getGallon
	
	/**
	 * method totalTripMileage 
	 * that calculates total miles/gallons for
	 * all the trips  
	 * @param miles
	 * @param gallons
	 * @return total miles per total gallons used 
	 */
	public double TripMileage(int miles,int gallons) {
		totalMiles= + miles; 
		totalGallons= + gallons; 
		double value= (double) totalMiles/totalGallons;
		return value; 		
		
	}//end method 
	
	
	//miles per gallons for each trip 
	public double totalTripMileage () {
		
		return (double) totalMiles/totalGallons; 
		
		
	}// end method 
	
		
		
 

	
	

}// end GasMileage 


