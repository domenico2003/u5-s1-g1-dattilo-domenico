package application.classes;

import java.util.List;

public class PizzaExtraCheese extends ModdPizza {

	public PizzaExtraCheese(Pizze pizza2) {
		this.setPizza(pizza2);
	}

	public String getName() {
		return this.getPizza().getName() + " extra cheese";
	}

	public double getPrice() {
		this.getPizza().setPrice(this.getPizza().getPrice() + 0.69);
		return this.getPizza().getPrice();
	}

	public double getCalories() {
		this.getPizza().setCalories(this.getPizza().getCalories() + 92);
		return this.getPizza().getCalories();
	}

	public List<String> getIngredienti() {
		this.getPizza().addIngrediente("cheese");
		return this.getPizza().getIngredienti();
	}
}
