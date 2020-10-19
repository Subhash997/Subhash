package www.xworkz.interfaceprogram;

public abstract class notebook implements book {

	 public void open() {
		 System.out.println("Opening the required page");
		 
	 }
	 public void writting() {
	 
		 System.out.println("Notedown the points or notes which neeede");
	 }
	 public void close() {
		 
		 System.out.println("Close the book after writting"); 
	 }
		abstract void Details();
	
}
