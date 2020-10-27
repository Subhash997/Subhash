package AnonymusClass;

public interface Messenger {


		void sendingMessage();
		void ReciveMsg();
		default void unseenMsg() {
			System.out.println("Unseen msg are in Unseen Side");
		}
}
