import java.text.*;
public class SalaryCalculator {
	private double hourlyRate;
	private int hour; 
	private String employerName; 
	
	public SalaryCalculator (double hourlyRate,int hour,
			String employerName) {
		
		this.hourlyRate=hourlyRate;
		this.hour=hour;
		this.employerName=employerName; 
		
	}//end of constructor
	
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate=hourlyRate; 
	}//
	
	public double getHourlyRate() {
		return hourlyRate; 
	}
	
	public void setHour(int hour ) {
		this.hour=hour;
	}
	
	public int getHour() {
		return hour ; 
	}
	
	public void setEmployerName(String name) {
		employerName=name; 
		
	}
	public String getEmployerName() {
		return employerName;
	}
	
	public void setEmployerInfo(double hourlyRate,int hour,String EmployerName) {
		setHourlyRate(hourlyRate);
		setHour(hour);
		setEmployerName(EmployerName);
	}
	
	public double calcSalary() {
		double salary=0.0;
		
		DecimalFormat d=new DecimalFormat("#.##");
		if(getHour()<=40) {
			salary=getHour()*getHourlyRate();
		
		}else if (getHour()>40) {
			salary=getHour()*getHourlyRate()+0.5; 
			
			
		}
		
		return Double.parseDouble(d.format(salary)); 
	}
	
	

}//end class 