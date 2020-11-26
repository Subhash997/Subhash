

	import java.util.ArrayList;

	public class ArrayListExample {

		public static void main(String[] args) {
			
			ArrayList<String> weekDays = new ArrayList<String>();
			weekDays.add("Monday");
			weekDays.add("Tuesday");
			weekDays.add("Wednesday");
			weekDays.add(3,"Thursday");
			
			Runnable week = new Runnable() {
				
				@Override
				public void run() {
					for(String str : weekDays) {
						System.out.println(str);
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};
			Thread t1 = new Thread(week);
			t1.start();
			
		}
}
