package www.multipleinheritance.com;

public class Vehicle implements Vehicleone , Vehicle2 {

	@Override
	public void distance() {
		int distance=100;
		System.out.println("Distance is more");
		
	}

	@Override
	public void speed() {
		System.out.println("Speed is 100");
		
	}


	
	}

	
