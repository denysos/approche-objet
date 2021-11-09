package fr.diginamic.formes;

public class Rectangle extends Forme {

	private double longueur = 0;
	private double largeur = 0;
	
	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return longueur * largeur;
	}
	
	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return 2 * (longueur + largeur);
	}

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public Rectangle(double cote) {
		super();
		this.longueur = cote;
		this.largeur = cote;
	}

	
	@Override
	public String toString() {
		return "Rectangle";
	}
	
	
}
