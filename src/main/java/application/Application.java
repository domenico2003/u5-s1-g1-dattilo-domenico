package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import application.classes.PizzaExtraSalami;
import application.classes.Pizze;
import application.classes.pizze.Margherita;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

// ESERCIZIO 1
		// esercizioUno();

// ESERCIZIO 2
		esercizioDue();
	}

	public static void esercizioUno() {
		log.info("hello world");
	}

	private static void esercizioDue() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
		log.info(ctx.getBean("margherita").toString());
		Pizze marg = new Margherita();
		log.info(new PizzaExtraSalami(marg).toString());
		log.info(((Pizze) ctx.getBean("margherita")).toString());

		ctx.close();
	}
}
