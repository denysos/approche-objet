package fr.diginamic.operations;

public class Operation {
	private double a;
	private double b;
	private char operateur;

	public Operation(double a, double b, char operateur) {
		super();
		this.a = a;
		this.b = b;
		this.operateur = operateur;
	}

	public double calcul() {
		double resultat;

		switch (operateur) {
		case ('+'):
			return resultat = a + b;
		case ('-'):
			return resultat = a - b;
		case ('*'):
			return resultat = a * b;
		case ('/'):
			return resultat = a / b;
		default:
			return 0D;

		}

	}
}
