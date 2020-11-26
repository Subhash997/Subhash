
public class HelloWorldJava {
	
		public static void main(String[] args) {
			System.out.println("Thread details are: " + Thread.currentThread().getId() + " Name: "
					+ Thread.currentThread().getName());


			Runnable hello25 = new Runnable() {
				
				@Override
				public void run() {
					
					for(int i = 0 ; i <= 5 ; i++) {
						System.out.println("Hello!!!!");
					}				
				}
			};
			Thread t1 = new Thread(hello25);
			t1.start();
			
			Runnable World50 = new Runnable() {
				
				@Override
				public void run() {
					for(int i = 0 ; i <= 5 ; i++) {
						System.out.println("World!!!!");
					}
				}
			};
			Thread t2 = new Thread(World50);
			t2.start();
		
			System.out.println(" End of Thread : " + Thread.currentThread().getId() + " Name: "
					+ Thread.currentThread().getName());

		}

}
