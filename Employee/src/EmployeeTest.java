
	public class EmployeeTest {

		public static void main(String[] args) {
			// test employee class 
			
			Employee employee=new Employee("Jack","Samy", 20000.5);
            employee.display();
			System.out.printf("%n%s %s salary is %.2f, he get %.2f raise",employee.getFName(),employee.getLName(),
						employee.getMonthlySalary(),employee.setRaise(10)); 
			
			

		}

	}



