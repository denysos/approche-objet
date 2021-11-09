package fr.diginamic.formes;

public class Cercle extends Forme {
	private double rayon = 0;

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return Math.PI * rayon * 2;
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return Math.PI * rayon * rayon;
	}

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Cercle";
	}
	
	
	
}
