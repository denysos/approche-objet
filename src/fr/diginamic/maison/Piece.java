package fr.diginamic.maison;

public abstract class Piece {
	private double superficie = 0;
	private int etage = 0;
	public Piece(double superficie, int etage) {
		super();
		this.superficie = superficie;
		this.etage = etage;
	}
	public double getSuperficie() {
		return superficie;
	}
	public int getEtage() {
		return etage;
	}
	
	
	
	

}
