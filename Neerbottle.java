package interfaceNew.com;

public class Neerbottle implements waterbottle {

	public String fillwater;
	public String seal;

	@Override
	public void fillwater() {
		System.out.println("Fill the water");
		
	}

	@Override
	public void seal() {
		System.out.println("Seal the bottle after filling water");
		
	}

	@Override
	public void color() {
		System.out.println("Blue color");
		
	}

	@Override
	public void metal() {
		System.out.println("Steel bottle");
		
	
	
	}

}
