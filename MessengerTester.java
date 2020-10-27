package AnonymusClass;

public class MessengerTester {

 public static void main(String[] args) {
		
	 Messenger messenger = new Messenger () {
		 
				

			@Override
			public void ReciveMsg() {
				System.out.println("Messege is recieved");
				
			}

			@Override
			public void sendingMessage() {
				System.out.println("Messagge is sent successfully");
				
			}
		};	
     messenger.sendingMessage();
     messenger.ReciveMsg();
     messenger.unseenMsg(); 
	 }
 }