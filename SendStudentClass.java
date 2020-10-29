package www.xworkz.javaprogarm;


	import java.io.FileOutputStream;
	import java.io.ObjectOutputStream;
	import java.io.IOException;
	public class SendStudentClass
	{
	  public static void main(String args[])
	  {
	    Student obj = new Student(101, 23, "Subhash", "Tiptur", 6);
	    try{ 
	      FileOutputStream fos = new FileOutputStream("Student.ser"); 
	      ObjectOutputStream oos = new ObjectOutputStream(fos);
	      oos.writeObject(obj);
	      oos.close();
	      fos.close();
	      System.out.println("Serialzation Done!!");
	   }catch(IOException ioe){
	      System.out.println(ioe);
	    }
	  }
	}

