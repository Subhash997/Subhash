
public class Remote {
	String brand;
	String color;
	int cost;
	public Remote(String brand, String color, int cost) {
		super();
		this.brand = brand;
		this.color = color;
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Remote [brand=" + brand + ", color=" + color + ", cost=" + cost + "]";
	}
	
	
	

}
