package entites2;

import entites.AdressePostale;

public class Personne {
	// le mot cle "public" permet d'accédé aux attributs de la classe hors de son package ?
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
	

}
