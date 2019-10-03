/**
 * Student class that stores a student
 * name and average 
 * @author nourannouh
 *
 */
public class Student {
	private String name;
	private double average;
	
	//constructor that initialize instance variable 
	public Student (String name,double ave) {
		this.name=name;
		if(ave>0.0)
			if(ave<=100.0)
				this.average=ave;
	
	}//end of constructor 
	
	//set name of the student 
	public void setName(String name) {
		this.name=name; 
	}//end of setName method
	
	//return student name 
	public String getName() {
		return name; 
	}
	//set student average
	public void setAverage(double average) {
		//validate average 
		if (average >0.0) {
			if(average<=100.0) {
				this.average=average; 
			}//end if 
		}// end if 
		
	}// end setAverage method 
	
	//return student average 
	
	public double getAverage() {
		return average; 
	}//end of getAverage 
	
	//gradeLetter method return the grade letter 
	//of the student based on their average
	public String gradeLetter() {
		String letterGrade=" "; //initialize it to empty string
		if(average>=90.0) {
			letterGrade="A";
			
		}else if (average>=80.0) {
			letterGrade="B";
			
		}else if (average>=70.0) {
			letterGrade="C";
			
		}else if (average>=60.0) {
			letterGrade="D"; 
			
		}else 
			letterGrade="F"; 
		
		return letterGrade; 
	
	}//end of gradeLetter method 
	
	
}//end class Student 