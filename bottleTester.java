package interfaceNew.com;

public class bottleTester {
public static void main (String [] args) {
	System.out.println("The output is: ");
	Neerbottle neerbottle = new Neerbottle();
	neerbottle.fillwater="coldwater";
	neerbottle.seal ="seal after filling";
	
	
	System.out.println("--");
	System.out.println("Upcasting");
	waterbottle Waterbottle= new Neerbottle();
	Waterbottle.fillwater();
	Waterbottle.seal();
	Waterbottle.color();
	Waterbottle.metal();
	

}
}
