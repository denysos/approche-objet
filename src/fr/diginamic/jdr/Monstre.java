package fr.diginamic.jdr;

public abstract class Monstre extends Personnage {

	private int valeurTrophee = 0;

	public Monstre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Monstre(int force, int pointsDeVie) {
		super(force, pointsDeVie);
		// TODO Auto-generated constructor stub
	}

	public int getValeurTrophee() {
		return valeurTrophee;
	}

	protected void setValeurTrophee(int valeurTrophee) {
		this.valeurTrophee = valeurTrophee;
	}

}
