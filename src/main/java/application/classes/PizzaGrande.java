package application.classes;

public class PizzaGrande extends ModdPizza {

	public PizzaGrande(Pizze pizza) {
		this.setPizza(pizza);

	}

	public String getName() {
		return this.getPizza().getName() + " grande";
	}

	public double getPrice() {
		this.getPizza().setPrice(this.getPizza().getPrice() + 4.15);
		return this.getPizza().getPrice();
	}

	public double getCalories() {
		this.getPizza().setCalories(this.getPizza().getCalories() * 1.95);
		return this.getPizza().getCalories();
	}
}
