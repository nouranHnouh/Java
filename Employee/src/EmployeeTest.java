
public class EmployeeTest {

	public static void main(String[] args) {
		// test employee class 
		
		Employee employee=new Employee("Jack","Samy", 20000.5);
		System.out.printf("%s %s salary is %.2f, he get %.2f raise",employee.getFirstName(),employee.getLastName(),
					employee.getSalary(),employee.Raise(10)); 
		
		

	}

}
