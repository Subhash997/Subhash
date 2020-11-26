

	public class Count51to100Example extends Thread {

		@Override
		public void run() {
			System.out.println("Thread details are: " + Thread.currentThread().getId() + " Name: "
					+ Thread.currentThread().getName());

			for (int i = 51; i <= 100; i++) {
				System.out.println( i );
			}

			System.out.println(" End of Thread : " + Thread.currentThread().getId() + " Name: "
					+ Thread.currentThread().getName());
			
			
			
		}
}
