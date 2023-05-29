package application.classes.pizze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import application.classes.Pizze;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Margherita extends Pizze {
	public Margherita() {
		String name = "margherita";
		double price = 4.99;
		double calories = 1104;
		List<String> ingredienti = new ArrayList(Arrays.asList("tomato", "cheese"));
	}
}
