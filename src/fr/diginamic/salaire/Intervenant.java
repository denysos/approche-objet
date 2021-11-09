package fr.diginamic.salaire;

public abstract class Intervenant {

	private String nom = "";
	private String prenom = "";
	
	abstract public double getSalaire();
	abstract protected String donneesSpecialisees();

	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public void afficherDonnees() {
		System.out.print(toString() + " ");
		System.out.println(donneesSpecialisees());
		
	}

	@Override
	public String toString() {
		return "Intervenant [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
}
