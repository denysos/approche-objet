package fr.diginamic.jdr;

public class Loup extends Monstre {

	public Loup() {
		super();
		setValeurTrophee(1);
		setPointsDeVie(JeuTirage.tirageEntre2BornesIncluses(5, 10));
		setForce(JeuTirage.tirageEntre2BornesIncluses(3, 8));
	}

	public Loup(int force, int pointsDeVie) {
		super(force, pointsDeVie);
		setValeurTrophee(1);

	}

}
