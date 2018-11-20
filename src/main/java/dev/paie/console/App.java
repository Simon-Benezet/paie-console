package dev.paie.console;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.paie.ihm.Menu;

/**
 * 1. Ajouter spring-context aux dépendances 2. Créer un contexte Spring
 * (AnnotationConfigApplicationContext + try + context.close()) 3. Créer la
 * config (Annot...Context(AppConfig.class))
 * 
 */
public class App {

	public static void main(String[] args) {
		// Création context Spring
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
			Menu menu = context.getBean(Menu.class);
			menu.demarrer();
		}

	}
}
