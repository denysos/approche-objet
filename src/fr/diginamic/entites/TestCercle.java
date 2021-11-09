package fr.diginamic.entites;

import utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cercle cercle1 = new Cercle(10);
//		Cercle cercle2 = new Cercle(100);

		Cercle cercle1 = CercleFactory.avecRayon(10);
		Cercle cercle2 = CercleFactory.avecRayon(100);

		System.out.println("cercle1 : perimetre : " + cercle1.perimetre() + " surface : " + cercle1.surface());
		System.out.println("cercle2 : perimetre : " + cercle2.perimetre() + " surface : " + cercle2.surface());

	}

}
