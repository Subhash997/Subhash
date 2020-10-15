package wrappingprog;

public class BoxingandUnboxingDouble {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Boxing/wrapping");
			double a = 0.01;
			Double c = new Double(a); 
			System.out.println("Boxing by Assigning double value to variable: "+c);
			Double d = new Double(0.02);
			System.out.println("Boxing by Giving double value directly: "+d);
			
			//Autoboxing:-
			Double h = a;
			System.out.println("Autoboxing by Assigning double value to variable: "+h);
			Double chr = 2.1;
			System.out.println("Autoboxing by Directly giving double value: "+chr);
			
			//Unboxing
			System.out.println();
			System.out.println("Unboxing");
			double x = Double.valueOf(c);//c is a wrapper class object(in boxing)
			System.out.println("Unboxing by Assigning double value to variable: "+x);
			double y = Double.valueOf(9.1);
			System.out.println("Unboxing by Directly giving double value: "+y);
			
			//Autounboxing:-
			double k = chr;  //ch is a wrapper class object(in boxing)
			System.out.println("autounboxing: "+k);
			
		}

}
