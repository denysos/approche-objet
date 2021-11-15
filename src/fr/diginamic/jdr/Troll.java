package fr.diginamic.jdr;

public class Troll extends Monstre {

	public Troll() {
		super();
		setValeurTrophee(5);
		setPointsDeVie(JeuTirage.tirageEntre2BornesIncluses(20, 30));
		setForce(JeuTirage.tirageEntre2BornesIncluses(10, 15));

	}

	public Troll(int force, int pointsDeVie) {
		super(force, pointsDeVie);
		setValeurTrophee(5);

	}

}
