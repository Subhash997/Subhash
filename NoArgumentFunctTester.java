package functionalInterface;

public class NoArgumentFunctTester {
 public static void main(String[] args) {
	 
	 NoArgumentFunct noArgumentFunct=()->"Namaste";
	 System.out.println(noArgumentFunct.printNamaste());
 }
}
