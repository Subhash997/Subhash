package string;

public class uppercase {
public static String uppercaseinEnd(String str) {
		
		int length = str.length();
		String a="";//a be upper characters
		String b = "";//b be lower characters
		
		for (int i=0;i<length;i++) {
			char c = str.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				a += c;
			}
			else
				b += c;
				
		}
		return b + " " + a;
				
	}
	public static void main(String[] args) {
		
		String str = "Namaste Friends";
		System.out.println("Given String is : " + str);
		System.out.println("UpperCase characters at the end of the string is : "+ uppercaseinEnd(str));
		
	}
}
