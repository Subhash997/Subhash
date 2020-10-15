package xworks.exceptionhandling;

public class Dividedbyzero {

		public static void main(String[] args) {
			
			int a = 5, b = 0;
			int res = 0;
			try {
			res = a / b;
			System.out.println(res);
			}catch(ArithmeticException e) {
				System.out.println("Entered the Zero Divisor");
			}
		}
	}

