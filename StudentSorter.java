package arraylist;
import java.util.ArrayList;
import java.util.Comparator;

public class StudentSorter {

	public static void main(String[] args) {
		Student Std1=new Student(16,"Rohan","J P Nagar");
		Student Std2=new Student(16,"Rahul","R R Nagar");
		Student Std3=new Student(18,"Rekha","Rajaji Nagar");
		Student Std4=new Student(14,"Ruhi","JayaNagar");
		ArrayList<Student> student= new ArrayList<Student>();
		student.add(Std1);
		student.add(Std2);
		student.add(Std3);
		student.add(Std4);
		for(Student eachStudent : student) {
			System.out.println(eachStudent);
		}
		
		student.sort(new StudentComparator());
		System.out.println("--Afret Sorting");
		for (Student eachStudent : student) {
			System.out.println(eachStudent);
		}
	}
	}
	
			
		

	

