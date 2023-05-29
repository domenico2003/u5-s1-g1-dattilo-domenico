package application.classes;

import java.util.List;

public class PizzaExtraPineapple extends ModdPizza {

	public PizzaExtraPineapple(Pizze pizza2) {
		this.setPizza(pizza2);
	}

	public String getName() {
		return this.getPizza().getName() + " extra pineapple";
	}

	public double getPrice() {
		this.getPizza().setPrice(this.getPizza().getPrice() + 0.79);
		return this.getPizza().getPrice();
	}

	public double getCalories() {
		this.getPizza().setCalories(this.getPizza().getCalories() + 24);
		return this.getPizza().getCalories();
	}

	public List<String> getIngredienti() {
		this.getPizza().addIngrediente("pineapple");
		return this.getPizza().getIngredienti();
	}
}
