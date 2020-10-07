
public class PalindromeOrNot {
public static void main (String args[]) {
	 int num=12321 ;
	 int r, sum=0, temp;
	 temp=num;
	 System.out.println("prog to find num is Palindrome or not:");
	 
	 while(num>0) {
		  r=num%10;
		  sum=(sum*10)+r;
		  num=num/10;
		  
	 }
	 if(temp==sum)
		 System.out.println("yes num is Palindrome");
	 else
		 System.out.println("the given num is not a Palindrome: ");
		  
}
}
