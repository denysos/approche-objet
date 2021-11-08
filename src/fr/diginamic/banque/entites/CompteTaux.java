package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private float tauxRemuneration;

	public CompteTaux(String numeroCompte, float solde, float tauxRemuneration) {
		super(numeroCompte, solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	// comment utiliser super ?
	@Override
	public String toString() {
		return super.toString() + " CompteTaux [tauxRemuneration=" + tauxRemuneration + "]";
	}

}
