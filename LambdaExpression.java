package string;

public class LambdaExpression {
	
		public static boolean isStringOnlyAlphabet(String strg) 
	    { 
	        return ((strg != null) 
	                && (!strg.equals(" ")) 
	                && (strg.chars().allMatch(Character::isLetter))); 
	    } 
		
		public static void main(String[] args) {
			
			String str = "Mike check 123 123!!";
			System.out.println("Check is String contains only alphabets in it : " + isStringOnlyAlphabet(str));
			
		}
		
		
}
