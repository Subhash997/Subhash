package arraylist;

public class Student {
 
	int age;
	String name;
	String address;
	public Student(int age, String name, String address) {
		this.age=age;
		this.name=name;
		this.address=address;
		
	}
	public int getAge() {
		return  age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return  name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAddress() {
		return  address;
	}
	public void setAddress(String Address) {
		this.address=address;
}
	public String toString() {
		return "Age: "+age+", Name:"+name+", Address:"+address;
		
	}
	
}

