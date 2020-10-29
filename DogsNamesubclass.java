package clonable;

public class DogsNamesubclass<DogsNameubclass> implements Cloneable {

	   private String dname;

		
	   public String getDname() {
	      return dname;
	   }

	   public void setDname(String dname) {
	      this.dname = dname;
	   }

	   // Overriding clone() method of Object class
	   public Object clone()throws CloneNotSupportedException{  
	      return (DogsNameubclass)super.clone();  
	   }
		
	   public static void main(String[] args) {
	      DogsNamesubclass obj1 = new DogsNamesubclass();
	      try {
		obj1.setDname("Pinky");
		//Cloning obj1 into obj2
		DogsNamesubclass obj2 = (DogsNamesubclass) obj1.clone();
				
		//Displaying both the objects content
		System.out.println(obj1.getDname());
		System.out.println(obj2.getDname());
				
		//Setting up name in obj2
		obj1.setDname("Rocky");
				
		//Displaying both the objects content
		System.out.println(obj1.getDname());
		System.out.println(obj2.getDname());
	      } catch (CloneNotSupportedException e) {
		   e.printStackTrace();
		}
	   }
	}