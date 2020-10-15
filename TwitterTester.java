package methodOverload;

public class TwitterTester {
public static void main(String [] args) {
	System.out.println("start program");
	
	Twitter j=new Twitter(2,25);
	j.getPosts();
	j.getFollowers();
}
}
