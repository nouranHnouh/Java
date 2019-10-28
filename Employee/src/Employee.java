
public class Employee {
	private String fName;
	private String lName;
	private double monthlySalary;
	
	public Employee(String fName,String lName, double monthlySalary) {
		this.fName=fName;
		this.lName=lName;
		this.monthlySalary=monthlySalary;
	}//end of constructor 
	
	public void setFName(String fName) {
		this.fName=fName;
		
	}//end of setFName
	
	public void setLName(String lName) {
		this.lName=lName;
	}//end setLName
	
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary=monthlySalary;
		
	}//end setMonthlySlary
	
	public String getFName() {
		return fName;
	}
	
	public String getLName() {
		return lName;
	}
	
	public double getMonthlySalary() {
		return monthlySalary; 
	}
	
	public void display() {
		System.out.printf("%s %s monthly salary is: %.2f ",fName,lName,monthlySalary);
	} 
	// new salary=(old salary*raise)+old salary 
	public double setRaise(double percentage) {
		 monthlySalary+=(monthlySalary/100)*percentage ; 
		 return monthlySalary; 
	}

}
