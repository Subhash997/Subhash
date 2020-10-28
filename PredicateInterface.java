package FunctionalInterfaceclibrary;
import java.util.function.Predicate;
public class PredicateInterface {
 public static void main (String[] arg) {
	 Predicate<Integer>lesserthan=i-> (i< 18);
	 System.out.println(lesserthan.test(10));
 }
}
