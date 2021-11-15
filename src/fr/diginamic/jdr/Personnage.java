package fr.diginamic.jdr;

public abstract class Personnage {

	protected int force = 0;


	protected int pointsDeVie = 0;

	public Personnage() {
		super();
	}

	public Personnage(int force, int pointsDeVie) {
		super();
		this.force = force;
		this.pointsDeVie = pointsDeVie;
	}

//	public void blessure(int degats );
	public void blessure(int degats) {
		setPointsDeVie(this.pointsDeVie - degats);

	}

	public void setPointsDeVie(int pointsDeVie) {
		this.pointsDeVie = pointsDeVie;
	}

	public int getForce() {
		return force;
	}

	public int getPointsDeVie() {
		return pointsDeVie;
	}
	
	protected void setForce(int force) {
		this.force = force;
	}

}
