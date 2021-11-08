package fr.diginamic.operations;

import java.util.Arrays;

public class Moyenne {

	private double[] tableau;

	public Moyenne(double[] tableau) {
		super();
		this.tableau = tableau;
	}

	public double calcul() {
		double total = 0;
		if (tableau.length == 0) {
			return 0;
		}
		
		for (int i = 0; i < tableau.length; i++) {
			total += tableau[i];
		}
		return total / tableau.length;
	}

	public double[] ajoute(double nouvelElement) {
		tableau = Arrays.copyOf(tableau, tableau.length + 1);
		tableau[tableau.length - 1] = nouvelElement;
		return tableau;
	}

}
