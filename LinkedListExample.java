
import java.util.*;  
	 class Employee implements Comparable<Employee>{  
	int id  ;
	String name,company,place;  
	 int salary;
	public Employee(int id, String name, String company , String place, int salary) {  
	    this.id = id;  
	    this.name = name;  
	    this.company = company;  
	    this.place = place;  
	    this.salary = salary;  
	}  
	public int compareTo1(Employee E) {  
	    if(id>E.id){  
	        return 1;  
	    }else if(id<E.id){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
	}
	public int compareTo11(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}  
	}  
	public class LinkedListExample {  
	public static void main(String[] args) {  
	    Queue<Employee> queue=new PriorityQueue<Employee>();  
	    //Creating Employee  
	    Employee E1=new Employee(10,"Raju","Tcs","Mumbai",15000);  
	    Employee E2=new Employee(20,"Ravi","TechMahindra","Delhi",17000);  
	    Employee E3=new Employee(30,"Ramu", "Winter solutions","Kolkotta",20000);  
	    //Adding Employee to the queue  
	    queue.add(E1);  
	    queue.add(E2);  
	    queue.add(E3);  
	    System.out.println("Traversing the queue elements:");  
	    //Traversing queue elements  
	    for(Employee E:queue){  
	    System.out.println(E.id+" "+E.name+" "+E.company+" "+E.place+" "+E.salary);  
	    }  
	    queue.remove();  
	    System.out.println("After removing one Employee:");  
	    for(Employee E:queue){  
	        System.out.println(E.id+" "+E.name+" "+E.company+" "+E.place+" "+E.salary);  
	        }  
	}  
}
