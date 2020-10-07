
public class WhileNaturalnumber { 
public static void main (String [] args) 
{
int num=7, count=0;
int i=2;
System.out.println("Program to check the num is prime or not");

while(i<num/2) {
	if(num%1==0)
	{
		count++;
	}
	i++;
}
if(count==0 && num!=1)
{
	System.out.println("the number is prime: " +num);
}
else
{
	System.out.println("the num is not prime: " +num);
}
}
}
