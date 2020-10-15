package methodOverload;

public class Twitter {

	private String name;
	private int posts;
	public int followers;
	
	
	public Twitter( int inPosts, int inFollowers)
	{
		name= "Subbu";
		posts=inPosts;
		followers=inFollowers;
		
		System.out.println("User Name:" + name);
	}
	
	public int getPosts() {
		System.out.println("Number of Posts:" + posts);
		return posts;
		}
	public void setPosts(int posts) {
		this.posts= posts;
	}
	public int getFollowers() {
	System.out.println("Number of Followers:" + followers);
	return followers;
	}
	public void setFollowers(int followers) {
		this.followers= followers;
	}
	
	

}
