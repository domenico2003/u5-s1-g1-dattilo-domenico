package application.classes;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Pizze {
	String name;
	double price;
	double calories;
	List<String> ingredienti;

	public void addIngrediente(String ingrediente) {
		ingredienti.add(ingrediente);
	}
}
