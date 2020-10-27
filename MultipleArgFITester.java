package functionalInterface;

public class MultipleArgFITester {
 
	public static void main(String[] args) {
		
		MultipleArgFI multipleArgFI =(integer1,integer2,integer3)->integer1+integer2+integer3;
		System.out.println(multipleArgFI.concatMultipleIntegers(24 ,10, 5));
	}
}
 