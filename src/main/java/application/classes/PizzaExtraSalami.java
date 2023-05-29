package application.classes;

import java.util.List;

public class PizzaExtraSalami extends ModdPizza {

	public PizzaExtraSalami(Pizze pizza2) {
		this.setPizza(pizza2);

	}

	public String getName() {
		return this.getPizza().getName() + " extra salami";
	}

	public double getPrice() {
		this.getPizza().setPrice(this.getPizza().getPrice() + 0.99);
		return this.getPizza().getPrice();
	}

	public double getCalories() {
		this.getPizza().setCalories(this.getPizza().getCalories() + 86);
		return this.getPizza().getCalories();
	}

	public List<String> getIngredienti() {
		ingredienti.add("salami");
		return this.getPizza().getIngredienti();
	}

	@Override
	public String toString() {
		return "PizzaExtraSalami [getName()=" + name + ", getPrice()=" + getPrice() + ", getCalories()="
				+ getCalories() + ", getIngredienti()=" + ingredienti + "]";
	}

}
