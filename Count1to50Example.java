

	public class Count1to50Example extends Thread {

		@Override
		public void run() {
			System.out.println("Thread details are: " + Thread.currentThread().getId() + " Name: "
					+ Thread.currentThread().getName());

			for (int i = 1; i <= 50; i++) {
				System.out.println( i );
			}

			System.out.println(" End of Thread : " + Thread.currentThread().getId() + " Name: "
					+ Thread.currentThread().getName());

			
		}
}
