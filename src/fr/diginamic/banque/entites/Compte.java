package fr.diginamic.banque.entites;

/**
 * tp05 encapsulation
 * @author denis
 *
 */

public class Compte {
	private String numeroCompte;
	private float solde;
	
	public Compte(String numeroCompte, float solde) {
		super();
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [numeroCompte=" + numeroCompte + ", solde=" + solde + "]";
	}
	
	
	

}
