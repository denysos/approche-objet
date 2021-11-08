package fr.diginamic.banque.entites;

public abstract class Operation {
	private String dateOperation;
	private float montant;

	public Operation(String dateOperation, float montant) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
	}

	public String getDateOperation() {
		return dateOperation;
	}

	public float getMontant() {
		return montant;
	}

	@Override
	public String toString() {
		return "[dateOperation= " + dateOperation + ", montant= " + montant + "]";
	}

	abstract String getType();
	
}
