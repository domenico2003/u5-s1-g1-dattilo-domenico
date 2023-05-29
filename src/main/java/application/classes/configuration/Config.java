package application.classes.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import application.classes.Pizze;
import application.classes.pizze.Margherita;

@Configuration
public class Config {

	@Bean
	public Pizze margherita() {

		return new Margherita();
	}

//	@Bean
//	public Pizze hawaiiana() {
//		List<String> ingredienti = new ArrayList<>();
//		ingredienti.add("tomato");
//		ingredienti.add("cheese");
//		ingredienti.add("pineapple");
//		ingredienti.add("ham");
//		return new Pizze("hawaiiana", 6.49, 1024, ingredienti);
//	}
//
//	@Bean
//	public Pizze salame() {
//		List<String> ingredienti = new ArrayList<>();
//		ingredienti.add("tomato");
//		ingredienti.add("cheese");
//		ingredienti.add("salami");
//
//		return new Pizze("salame", 5.99, 1160, ingredienti);
//	}
//
//	@Bean
//	public Bibite limonata() {
//
//		return new Bibite("limonata", 1.29, 128, 0.33, 0);
//	}
//
//	@Bean
//	public Bibite acqua() {
//
//		return new Bibite("acqua", 1.29, 0, 0.5, 0);
//	}
//
//	@Bean
//	public Bibite vino() {
//
//		return new Bibite("vino", 7.49, 607, 0.75, 13);
//	}
}
