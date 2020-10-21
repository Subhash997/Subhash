package www.multipleinheritance.com;

 interface Vehicle2 {
	void distance();
		int distance=100;
		public default void speed() {
			int speed=distance/100;
		}
}
