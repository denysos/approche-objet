package fr.diginamic.entites;

public class Cercle {
	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public double perimetre() {
		return 2 * rayon * Math.PI;
	}

	public double surface() {
		return Math.PI * rayon * rayon;
	}

}
