package dish_delight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number of dishes");
			
			int num = sc.nextInt();
			sc.nextLine();
			//int num = Integer.parseInt(sc.nextLine());
			
			List<Dish>dishes = new ArrayList<>();
			System.out.println("Enter the dish details");
			for(int i=0;i<num;i++) {
				String dish= sc.nextLine();
				String[]part = dish.split(":");
				String name = part[0];
				String cousin = part[1];
				double price = Double.parseDouble(part[2]);
				double rating = Double.parseDouble(part[3]);
				dishes.add(new Dish(name,cousin,price,rating));
			}
			System.out.println("Enter the cuisine");
			String cousin = sc.nextLine(); 
			
			List<Dish>dis = DishUtil.getDishesByCousin(dishes,cousin);
			 if (dis.isEmpty()) {
			        System.out.println("No dishes were found for the given cuisine " + cousin);
			    } else {
			        System.out.println("Dishes of cuisine " + cousin+ " are");
			        for (Dish dish : dis) {
			            System.out.println(dish);
			        }
			    }
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
