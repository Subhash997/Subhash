package arraylist;

	import java.util.*;  
	class javaExample{  
	   public static void main(String args[]){  
	      ArrayList<String> alist=new ArrayList<String>();  
	      alist.add("Guru");
	      alist.add("Tanu");
	      alist.add("Laxman");
	      alist.add("Pavan");
	      alist.add("Akil");
	     
	  
	      //displaying elements
	      System.out.println(alist);
	  
	      //Adding "Guru" at the fourth position
	      alist.add(3, "Guru");
	  
	      //displaying elements
	      System.out.println(alist);
	   }  
}
