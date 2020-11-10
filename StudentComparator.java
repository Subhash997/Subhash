/**
 * 
 */
package arraylist;

import java.util.Comparator;


public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int Comparison=0;
		Comparison=o1.getName().compareTo(o2.getName());
		if(Comparison==0) {
			Comparison=o1.getAddress().compareTo(o2.getAddress());
		
			
		}
		return Comparison;
	
	}

}
