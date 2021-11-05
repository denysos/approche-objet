package entites2;

import entites.AdressePostale;

public class Personne {
	// le mot cle "public" permet d'accédé aux attributs de la classe hors de son
	// package ?
	public String nom;
	public String prenom;
	public AdressePostale adresse;

	public Personne() {
		System.out.println("coucou constructeur vide");
	}

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, AdressePostale adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}

	public void afficheNOMetPrenom() {
		System.out.println(nom.toUpperCase() + " " + prenom);
	}

	public void setterNom(String nvNom) {

		this.nom = nvNom;
	}
	
	public void setterPrenom(String nvPrenom) {

		this.prenom = nvPrenom;
	}
	
	public void setterAdresse(AdressePostale nvAdresse) {

		this.adresse = nvAdresse;
		System.out.println("adresse modifiee pour : " + nom + " " + prenom);
	}
	
	
	public String getterNom() {
		
		return nom;
	}
	
	public String getterPrenom() {
		
		return prenom;
	}
	
	public AdressePostale getterAdresse() {
		
		return adresse;
	}
	
	
}
