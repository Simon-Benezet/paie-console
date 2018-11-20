package dev.paie.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cotisation {
	@Id
	@GeneratedValue
	private Integer id;
	private String code;
	private String libelle;
	private BigDecimal tauxSalarial;
	private BigDecimal tauxPatronal;
	private Boolean imposable = false;

	@Override
	public String toString() {
		return "Cotisation [code=" + code + ", libelle=" + libelle + ", tauxSalarial=" + tauxSalarial
				+ ", tauxPatronal=" + tauxPatronal + ", imposable=" + imposable + "]";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public BigDecimal getTauxSalarial() {
		return tauxSalarial;
	}

	public void setTauxSalarial(BigDecimal tauxSalarial) {
		this.tauxSalarial = tauxSalarial;
	}

	public BigDecimal getTauxPatronal() {
		return tauxPatronal;
	}

	public void setTauxPatronal(BigDecimal tauxPatronal) {
		this.tauxPatronal = tauxPatronal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getImposable() {
		return imposable;
	}

	public void setImposable(Boolean imposable) {
		this.imposable = imposable;
	}
}
