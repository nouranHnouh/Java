import java.util. *; 
public class Average {

	public static void main(String[] args) {
		
		int total=0;// calculate total 
		int gradeCounter=0;// count grades
		
		//prompt user for input
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter garde or -1 to quit: ");
		int grade=scan.nextInt();
		
		while(grade!=-1) { //loop ten time
			total+=grade; // calculate the total of the grade 
			gradeCounter+=1;// increment the counter 
			
			
			System.out.println("Enter garde or -1 to quit: ");
			
			//ask for integer value 
			grade=scan.nextInt();
			
				
		}//end while 
		
		if(gradeCounter!=0) {
			//take care of integer devision 
			double average=(double) total/gradeCounter; 
			//display total and average of grade 
			System.out.printf("the total of all 10 grades is: %d%n", total);
			System.out.printf("the average of the 10 grades is %.2f",average);
			
			
		}//end if 
		else {
			System.out.println("No gardes Enetred"); 
		}
		

	}//end main

}//end class Average 
