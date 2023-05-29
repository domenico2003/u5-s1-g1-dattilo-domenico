package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

// ESERCIZIO 1
		esercizioUno();

// ESERCIZIO 2
		esercizioDue();
	}

	public static void esercizioUno() {
		log.info("hello world");
	}

	private static void esercizioDue() {
		// TODO Auto-generated method stub

	}
}
