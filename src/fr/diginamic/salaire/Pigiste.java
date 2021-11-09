package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	private int nombreDeJoursTravaillesMois = 0;
	private double montantRemunerationJournaliere = 0;

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return nombreDeJoursTravaillesMois * montantRemunerationJournaliere;
	}

	public Pigiste(String nom, String prenom, int nombreDeJoursTravaillesMois, double montantRemunerationJournaliere) {
		super(nom, prenom);
		this.nombreDeJoursTravaillesMois = nombreDeJoursTravaillesMois;
		this.montantRemunerationJournaliere = montantRemunerationJournaliere;
	}
	
	@Override
	protected String donneesSpecialisees() {
		
		return "remuneration : " + Double.toString(getSalaire()) + " Statut : Pigiste" ;
	}

}
