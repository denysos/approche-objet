package fr.diginamic.listes;

public class Ville {

	private String nom;
	private int nbHab;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbHab() {
		return nbHab;
	}
	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}
	public Ville(String nom, int nbHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
	}
	
	
	
	
	
}