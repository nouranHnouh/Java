import java.util.*;
public class SalaryCalculatorTest {

	public static void main(String[] args) {
		SalaryCalculator salary= new SalaryCalculator(20.0,30,"Jhon");
		//System.out.printf("%s worked %d hours and he is hourly rate is %.2f",
				//salary.getEmployerName(),salary.getHour(),salary.getHourlyRate());
		
	salary.setEmployerInfo(18.6, 45, "Mark");
	System.out.println(salary.getEmployerName());
	System.out.println(salary.getHour());
	System.out.println(salary.getHourlyRate());
	System.out.println(salary.calcSalary());
	
	//get employer info from the user 
		
	

	}

}
