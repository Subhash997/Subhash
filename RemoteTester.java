import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class RemoteTester {
	private static final String Rem = null;
	public static void main(String[] args, Object Remote) {

		Remote Videocon= new Remote("Videocon","BLACK",200);
		Remote Onida = new Remote("Onida","WHITE",100);
		

		ArrayList<Remote> Rem1= new ArrayList<Remote>();
		Rem1.add(Videocon);
		Rem1.add(Onida);
		

		System.out.println("Traverse using enhanced for loop");
		for(Remote ref:Rem1) {
			System.out.println(ref);
		}

		System.out.println("Traverse using iterator");

		Iterator<Remote> itr = ((ArrayList<Remote>) Rem1).iterator();
		while(itr.hasNext()) {
			Remote n = itr.next();
			System.out.println(n);
		}

		System.out.println("Traverse using list iterator");

		ListIterator<Remote> lstitr = ((ArrayList<Remote>) Rem1).listIterator();
		while(lstitr.hasNext()) {
			Remote n = lstitr.next();
			System.out.println(n);
		}
		System.out.println("Using has previous list iterator");
		while(lstitr.hasPrevious()) {
			Remote n = lstitr.previous();
			System.out.println(n);
		}


	}
	public static String getRem() {
		return Rem;
	}


}
