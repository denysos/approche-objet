package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * TP10 exo 3 : Apprenez à manipuler une liste d’entiers
 * 
 * @author denis
 *
 */

public class TestListInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> listeEntiers = new ArrayList<>();
		int[] tableauEntiers = { -1, 5, 7, 3, -2, 4, 8, 5 };

		for (int i = 0; i < tableauEntiers.length; i++) {
			listeEntiers.add(tableauEntiers[i]);

		}

		System.out.println("affichage des elements de la liste : ");
		for (Integer i : listeEntiers) {
			System.out.println("elt :" + i);
		}
		System.out.println("taille de la liste : " + listeEntiers.size());

		System.out.print("plus grand element : ");
		int max = listeEntiers.get(0);
		for (Integer i : listeEntiers) {
			if (i.intValue() > max) {
				max = i.intValue();
			}
		}
		System.out.println(max);

		int min = listeEntiers.get(0);
		for (Iterator iterator = listeEntiers.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			if (integer < min) {
				min = integer;
				iterator.remove();
			}

		}

		System.out.print("plus petit element : ");
		System.out.println(min);

		System.out.println("affichage de la liste sans le min : ");
		for (int i : listeEntiers) {
			System.out.println(i);
		}

		System.out.println("liste des valeurs absolues :");

		for (int i : listeEntiers) {
			if (i < 0) {
				listeEntiers.set(listeEntiers.indexOf(i), Math.abs(i));
			}
		}

		for (int i : listeEntiers) {

			System.out.println(i);

		}

	}

}
