package dev.paie.ihm;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import dev.paie.service.CotisationService;

//this.options.put(1, new ListerCotisationsOptionMenu(cotisService));
//this.options.put(2, new CreerCotisationOptionMenu(scanner));
//this.options.put(3, new SupprimerCotisationOptionMenu(scanner));

@Controller
public class Menu {
	// Recherche dans le contexte des beans Spring de type OptionMenu
	private Map<Integer, OptionMenu> options = new HashMap<>();
	private Scanner scanner;

	private ApplicationContext context;

	private Menu(Scanner scanner, CotisationService cotisService, ApplicationContext context) {
		init(scanner, cotisService, context);
		this.scanner = scanner;
	}

	private void init(Scanner scanner, CotisationService cotisService, ApplicationContext context) {
		Map<String, OptionMenu> beansTrouves = context.getBeansOfType(OptionMenu.class);
		Collection<OptionMenu> optionsTrouve = beansTrouves.values();
		int i = 1;
		for (OptionMenu opt : optionsTrouve) {
			this.options.put(i, opt);
			i++;
		}
	}

//	private void init2(Scanner scanner, CotisationService cotisService, ApplicationContext context) {
//		Map<String, OptionMenu> beansTrouves = context.getBeansOfType(OptionMenu.class);
//		AtomicInteger increment = new AtomicInteger();
//		beansTrouves.forEach((idSpring, valeur) -> {
//			this.options.put(increment.incrementAndGet(), valeur);
//		});
//	}

	public void demarrer() {
		while (true) {
			// Afficher les libellés des options
			this.options.forEach((key, option) -> {
				System.out.println(key + ". " + option.getLibelle());
			});

			int optionMenuChoisie = this.scanner.nextInt();

			this.options.get(optionMenuChoisie).executer();
		}

	}

}
