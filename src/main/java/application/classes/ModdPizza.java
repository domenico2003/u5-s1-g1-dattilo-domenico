package application.classes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class ModdPizza extends Pizze {

	private Pizze pizza;

}
