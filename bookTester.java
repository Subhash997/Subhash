package www.xworkz.interfaceprogram;

public class bookTester {
 public static void main(String[] args) {
	 
	 System.out.println("Child class ");
	 Dairybook dairybook=new Dairybook();
	 dairybook.brandname= "King";
	 dairybook.price=100;
			 dairybook.open();
	 dairybook.writting();
	 dairybook.close();
	 
	 System.out.println("-----");
	 System.out.println("Upcasting");
	 notebook Notebook=new Dairybook();
	 Notebook.open();
	 Notebook.writting();
	 Notebook.close();
	 Notebook.Details();
	 
	 
 }
}

