package fr.diginamic.entites;

public class Salarie {
	private String nom;
	private String prenom;
	private double salaire;

	public Salarie(String ligne) {
		super();

		String[] ligneEnTableau = ligne.split(";");
		String nomDeLaPersonne = ligneEnTableau[0];
		String prenomDeLaPersonne = ligneEnTableau[1];
		String salaireDeLaPersonne = ligneEnTableau[2];
		salaireDeLaPersonne = salaireDeLaPersonne.replace(" ", "");

		this.nom = nomDeLaPersonne;
		this.prenom = prenomDeLaPersonne;
		this.salaire = Double.parseDouble(salaireDeLaPersonne);
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public double getSalaire() {
		return salaire;
	}

}
