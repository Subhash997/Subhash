package arraylist;



import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class iterator
{
  public static void main(String[] args) 
  {
	List<String> names = new LinkedList<>();
	names.add("Ramu");
	names.add("Pooja");
	names.add("Chandru");
	
	// Getting Iterator
	Iterator<String> namesIterator = names.iterator();
		
	// Traversing elements
	while(namesIterator.hasNext()){
		System.out.println(namesIterator.next());			
	}	
	
  }
}


