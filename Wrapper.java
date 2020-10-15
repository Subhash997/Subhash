package wrappingprog;

public class Wrapper{
	public static void main(String[] args) {
		
	System.out.println("wrapping"); //wrapping are also known as boxing in oops but in java we called it as wrapping
	char a = 'a';
	Character c = new Character(a); 
	System.out.println("boxing by assigning char value to variable: "+c);
	Character d = new Character('x');
	System.out.println("boxing by giving char value directly: "+d);
	
	//autoboxing
	Character S = a;
	System.out.println("autoboxing by assigning char value to variable: "+S);
	Character cha = 'b';
	System.out.println("autoboxing by directly giving char value: "+cha);
	
	//unboxing
	System.out.println();
	System.out.println("Unboxing member");
	char x = Character.valueOf(c);//c is a wrapper class objectin the boxing)
	System.out.println("Unboxing by assigning char value to variable: "+x);
	char y = Character.valueOf('y');
	System.out.println("Unboxing by directly giving char value: "+y);
	
	//autounboxing
	char u = cha;  //ch is a wrapper class object in the boxing)
	System.out.println("autounboxing: "+u);
	


}
}
