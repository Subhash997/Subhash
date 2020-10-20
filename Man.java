package Accessmodifier;

public interface Man {

	void eating();
	void walking();
	
	default void growth() {
		System.out.println("Humans has growth");
	}
}
