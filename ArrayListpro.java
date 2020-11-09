package arraylist;

import java.util.ArrayList;

public class ArrayListpro {
 public static void main(String[] args) {
	String[] fruits= new String[4];
	fruits[0] = "Mango";
	fruits[1] ="Oragnge";
	fruits[2]="Grephs";
 System.out.println(fruits);
 
  ArrayList fruitList =new ArrayList();
  fruitList.add("Mango");
  fruitList.add("Orange");
  fruitList.add("Grephs");
  fruitList.add("Banana");
  fruitList.remove((1));
  fruitList.contains("Pineapple");
  System.out.println(fruitList.contains("Pineapple"));
 System.out.println(fruitList);
}
}
