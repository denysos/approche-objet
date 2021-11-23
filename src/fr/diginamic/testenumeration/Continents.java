package fr.diginamic.testenumeration;

public enum Continents {
	
	EUROPE("Europe"), ASIE("Asie"), AMERIQUE("Amerique"), AFRIQUE("Afrique"), OCEANIE("Oceanie");
	
	private String libelle;

	private Continents(String libelle) {
		this.libelle = libelle;
	}
	
	

}
