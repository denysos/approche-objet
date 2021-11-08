package utils;

import entites.Cercle;

public class CercleFactory {
	public static Cercle avecRayon(double rayon) {
		return new Cercle(rayon);
	}
}
