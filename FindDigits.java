
public class FindDigits {
public static void main (String args[]) {
	int count=0 ;
	int num=456;
	System.out.println("Prog to find num of Digits");
	do
	{
		num=num/10;
		count++;
		
	}
	while(num!=0);
	System.out.println("num of digits: "+count);
}
}
