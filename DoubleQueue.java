import java.util.PriorityQueue;

public class DoubleQueue {

	                         

	public static void main(String[] args) {
			
			PriorityQueue<Double> Ext = new PriorityQueue<Double>(); 
			
			Ext.add(15.00);
			Ext.add(16.10);
			Ext.add(9.40);
			Ext.add(35.00);
			Ext.add(34.00);
			Ext.add(45.00);
			Ext.add(20.00);
			Ext.add(19.50);
			Ext.add(50.00);
			Ext.add(26.08);
			
			System.out.println(Ext);
			
			System.out.println();
	        System.out.println("Traversing using enhanced for each() loop: ");
			for(double Ex : Ext) {
				System.out.println(Ex);
			}
			
			//peek(): This method returns null if the Queue is empty.
			System.out.println();
			System.out.println("peek of first element:" +Ext.peek()); 
			
			//offer(object): This is same as add() method.
			Ext.offer(10.00);
			System.out.println();
			System.out.println(Ext); 
			
			// element(): This method returns the head (the first element) of the Queue.
			System.out.println();
			System.out.println("element of dqueue :" + Ext.element());
			System.out.println(Ext); 
			
			System.out.println();
			System.out.println("poll of first element:" + Ext.poll());
			System.out.println(Ext); 
			
			//remove(): This method removes the head(first element) of the Queue.
			Ext.remove(); 
			System.out.println();
			System.out.println(Ext); 
			
			Ext.remove(22.00); // remove -> index or object 
			System.out.println();
			System.out.println(Ext); 
			
	}
}
