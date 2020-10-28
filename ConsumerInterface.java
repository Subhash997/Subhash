package FunctionalInterfaceclibrary;
import java.util.function.Consumer;
public class ConsumerInterface {
  static void printMessage(String name) {
	 System.out.println("Hello "  +name);
	 
 }
 public static void main(String[] args) {
	 Consumer<String>Consumer1=ConsumerInterface::printMessage;
	 Consumer1.accept("Subhash");

 }
}
