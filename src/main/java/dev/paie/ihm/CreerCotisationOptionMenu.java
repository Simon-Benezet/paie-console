package dev.paie.ihm;

import java.math.BigDecimal;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import dev.paie.domain.Cotisation;
import dev.paie.service.CotisationService;

@Controller
public class CreerCotisationOptionMenu extends OptionMenu {

	@Autowired
	private Scanner scanner;
	@Autowired
	private CotisationService cotisService;

	public CreerCotisationOptionMenu() {
		super("Créer une cotisation");
	}

	@Override
	public void executer() {
		System.out.println("Création d'une cotisation");

		System.out.println("Entrez le code : ");
		String codeSaisie = this.scanner.next();

		System.out.println("\nEntrez le libelle : ");
		String libelle = this.scanner.next();

		System.out.println("\nEntrez le tauxSalarial : ");
		BigDecimal tauxSalarial = this.scanner.nextBigDecimal();

		System.out.println("\nEntrez le tauxPatronal : ");
		BigDecimal tauxPratonal = this.scanner.nextBigDecimal();

		System.out.println("\nimposable ou non imposable ? : ");
		Boolean imposable = this.scanner.nextBoolean();

		cotisService.sauver(codeSaisie, libelle, imposable, tauxPratonal, tauxSalarial);

	}

}
