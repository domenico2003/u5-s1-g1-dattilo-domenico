package application.classes;

import java.util.List;

public class PizzaExtraOnions extends ModdPizza {

	public PizzaExtraOnions(Pizze pizza2) {
		this.setPizza(pizza2);
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return this.getPizza().getName() + " extra onions";
	}

	public double getPrice() {
		this.getPizza().setPrice(this.getPizza().getPrice() + 0.69);
		return this.getPizza().getPrice();
	}

	public double getCalories() {
		this.getPizza().setCalories(this.getPizza().getCalories() + 22);
		return this.getPizza().getCalories();
	}

	public List<String> getIngredienti() {
		this.getPizza().addIngrediente("onions");
		return this.getPizza().getIngredienti();
	}
}
