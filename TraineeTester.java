

	import java.util.HashMap;

	public class TraineeTester {

		public static void main(String[] args) {
			
			//Trainee-NoOfClasses
			HashMap<Trainee,Integer> trainee = new HashMap<Trainee,Integer>();
			
			Trainee t1 = new Trainee("Rahul", 22, "Python");
			Trainee t2 = new Trainee("Ravi", 24, "Html");
			Trainee t3 = new Trainee("Abhilash", 20, "CSS");
			
			trainee.put(t1, 60);
			trainee.put(t2, 120);
			trainee.put(t3, 30);
			
			System.out.println(trainee);
			
			//Traversing :
			System.out.println();		
			trainee.forEach((k,v) -> System.out.println("key: "+ k + " Value: "+ v));
		
		}
}
