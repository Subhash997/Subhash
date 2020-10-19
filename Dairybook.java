package www.xworkz.interfaceprogram;

public  class Dairybook extends notebook implements book {

	String brandname;
	int price;
	public void open() {
		System.out.println("To open the book");
	}
	public void wrtting() {
		System.out.println("Note all points");
		
	}
	
	public void close() {
	System.out.println("Close the book");
	}
	public void Details() {
	System.out.println("Brand: "+ brandname+ "| " + "Price: " + price);
	}
		
	}

