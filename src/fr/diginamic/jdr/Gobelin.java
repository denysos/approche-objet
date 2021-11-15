package fr.diginamic.jdr;

public class Gobelin extends Monstre {

	public Gobelin() {
		super();
		setValeurTrophee(2);
		setPointsDeVie(JeuTirage.tirageEntre2BornesIncluses(10, 15));
		setForce(JeuTirage.tirageEntre2BornesIncluses(5, 10));
	}

	public Gobelin(int force, int pointsDeVie) {
		super(force, pointsDeVie);
		setValeurTrophee(2);
	}

}
