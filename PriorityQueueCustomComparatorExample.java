

	import java.util.Comparator;
	import java.util.PriorityQueue;

	public class PriorityQueueCustomComparatorExample {
	    public static void main(String[] args) {
	        // A custom comparator that compares two Strings by their length.
	        Comparator<String> stringLengthComparator = new Comparator<String>() {
	            @Override
	            public int compare(String s1, String s2) {
	                return s1.length() - s2.length();
	            }
	        };

	       
	        

	        // Create a Priority Queue with a custom Comparator
	        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator);

	        // Add items to a Priority Queue (ENQUEUE)
	        namePriorityQueue.add("Virat");
	        namePriorityQueue.add("Dhoni");
	        namePriorityQueue.add("Rohit");
	        namePriorityQueue.add("Ashwin");
	        namePriorityQueue.add("Mayank");
	        namePriorityQueue.add("Kishan");

	        // Remove items from the Priority Queue (DEQUEUE)
	        while (!namePriorityQueue.isEmpty()) {
	            System.out.println(namePriorityQueue.remove());
	        }
	    }
}
