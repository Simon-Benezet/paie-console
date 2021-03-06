package dev.paie.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.context.annotation.Bean;

import dev.paie.domain.Cotisation;

public interface CotisationService {
	
	List<Cotisation> lister();
	
	@Bean
	Cotisation sauver(String codeSaisie, String libelle, Boolean imposable, BigDecimal tauxPratonal, BigDecimal tauxSalarial);
	
	@Bean
	public void suppr(String code);
}
