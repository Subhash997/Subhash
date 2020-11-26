

	import java.util.HashMap;

	public class HashMapExp {

		public static void main(String[] args) {
			
			HashMap<String,String> students = new HashMap<String,String>(); //Creating HashMap   
			
			//HashMap contains only unique keys.
			
			students.put("1A100","Ashok");  //Put elements in Map  
			students.put("1A200","Ravi");  
			students.put("1A300","Ramu"); 
			students.put("1A400","Chandan");  
			students.put("1A500","Praveen"); 
			
			System.out.println(students);
			
			students.put("1A700","Varun");
			System.out.println(students);
			
			students.put("1B10","Rakesh");
			students.put("1B20","Rahul");
			System.out.println(students);
			
			students.put(null, null);
			System.out.println(students);
			
			students.put(null, "Sachin"); //may have one null key and multiple null values.
			students.put(null, "Sanjay");
			System.out.println(students);

		}
}
