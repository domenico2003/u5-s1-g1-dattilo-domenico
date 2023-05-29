package application.classes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Bibite {
	private String name;
	private double price;
	private double calories;
	private double capienza;
	private int gradoAlcolico;

	public Bibite(String name, double price, double calories, double capienza, int gradoAlcolico) {

		this.name = name;
		this.price = price;
		this.calories = calories;
		this.capienza = capienza;
		this.gradoAlcolico = gradoAlcolico;
	}

}
