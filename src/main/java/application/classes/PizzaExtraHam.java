package application.classes;

import java.util.List;

public class PizzaExtraHam extends ModdPizza {

	public PizzaExtraHam(Pizze pizza2) {
		this.setPizza(pizza2);
	}

	public String getName() {
		return this.getPizza().getName() + " extra ham";
	}

	public double getPrice() {
		this.getPizza().setPrice(this.getPizza().getPrice() + 0.99);
		return this.getPizza().getPrice();
	}

	public double getCalories() {
		this.getPizza().setCalories(this.getPizza().getCalories() + 35);
		return this.getPizza().getCalories();
	}

	public List<String> getIngredienti() {
		this.getPizza().addIngrediente("ham");
		return this.getPizza().getIngredienti();
	}
}
