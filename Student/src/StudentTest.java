
public class StudentTest {

	public static void main(String[] args) {
		// create object of class Student
		Student student1= new Student("Sara",75.5);
		Student student2= new Student("Linda",98);
		
		System.out.printf("%s letter garde is: %s ",student1.getName(),student1.gradeLetter());  
		System.out.printf("%n%s letter garde is: %s ",student2.getName(),student2.gradeLetter());  
		
		

	}

}