package fr.diginamic.operations;

import java.util.Arrays;

public class Moyenne {

	private double[] tableau;

	public Moyenne(double[] tableau) {
		super();
		this.tableau = tableau;
	}

	public double calcul() {

		if (tableau.length == 0) {
			return 0;
		}
		return tableau[0];
	}

	public double[] ajoute(double nouvelElement) {
		double[] tableauFinal = Arrays.copyOf(tableau, tableau.length + 1);
		tableauFinal[tableauFinal.length - 1] = nouvelElement;
		return tableauFinal;
	}

}
