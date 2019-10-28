/**
 * @author Nouran Nouh 
 * Lab3. CST8110_340 Introduction to computer programming 
 * this program initialize three instance variable 
 * plate, time and velocity
 * it takes the plate, velocity and time from the user 
 * and output them 
 */
package car; 
import java.util. *; 
import java.text.*;

// define class car 
public class Car { 
	Scanner scanner=new Scanner(System.in);
	
	private String plate; 
	private int time; 
	private double velocity; 
	
	// default constructor 
	public Car() {
		this.plate= "AAAA";
		this.time=10;
		this.velocity=98.0; 
			
			
	}
	
	// normal constructor that 
	//initialize instance variable 
	public Car(String plate, int time, double velocity) {
		this.plate=plate;
		this.time=time;
		this.velocity=velocity; 
		
	}// end of constructor 
	
	//copy constructor 
	public Car(Car c) {
		plate=c.plate;
		time=c.time;
		velocity=c.velocity; 
	}
	
	/** method inputVelocity that 
	 * initialize scanner object and 
	 * take plate as input from the user 
	 */ 
	public void inputPlate()
	{
		 
		System.out.print("Enter plate number: \n");
		plate= scanner.nextLine(); 

	}// end of inputPlate 
	
	/** method inputVelocity that 
	 * initialize scanner object and 
	 * take time as input from the user 
	 */ 
	public void inputTime()
	{
		
		System.out.print("Enter the time: \n");
		time= scanner.nextInt();

		
	}// end of inputTime
	
	/** method inputVelocity that 
	 * initialize scanner object and 
	 * take velocity as input from the user 
	 */ 
	public void inputVelocity() {
		System.out.print("Enter the velocity: \n");
		velocity= scanner.nextDouble();
		scanner.close();
		
	}// end of inputVelocity 
	
	/**displayCar method output plate number, 
	 * time and velocity instance variables
	 * 
	 */
	public void displayCar() {
		System.out.printf("Plate is %s with time of %d, velocity of %.2f",plate,time,velocity); 
		
		
	}// end of displayCar method 
	
	
	/** method calcAcceleration 
	 * calculate the acceleration: a=v/t
	 * @return its formated value 
	 */
	
	public double calcAcceleration() {
		double a;
		
		//calculate Acceleration 
		a=velocity/time; 
		
		// format the result using DecimalFormat
		DecimalFormat df = new DecimalFormat("#.##");
		
		// return formated results by converting string back to double
		return Double.parseDouble(df.format(a)); // formated  
	
	}// end of calcAccelaration 
	

}// end of class 
