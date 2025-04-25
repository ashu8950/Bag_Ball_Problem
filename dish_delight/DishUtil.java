package dish_delight;

import java.util.List;
import java.util.stream.Collectors;


public class DishUtil {
	 static List<Dish> getDishesByCousin(List<Dish>dishes, String cousin){
		return dishes.stream().filter(d->d.getCousin().equalsIgnoreCase(cousin)).collect(Collectors.toList());
	}
}