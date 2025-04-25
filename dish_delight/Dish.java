package dish_delight;

public class Dish {
	private String name;
	private String cousin;
	private double price;
	private double rating;
	public Dish(String name,String cousin,double price,double rating) {
		this.name = name;
		this.cousin = cousin;
		this.price = price;
		this.rating = rating;
	}
	
	public String getCousin() {
		return cousin;
	}
	@Override
	public String toString() {
		return "Dish [name=" + name + ", cousin=" + cousin + ", price=" + price + ", rating=" + rating + "]";
	}
	
	
}
