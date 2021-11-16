package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * TP10 exo2 : fusion liste
 * @author denis
 *
 */

public class FusionListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		ArrayList<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		//TODO Développements à réaliser ci-dessous
		
		
		ArrayList<String> liste3 = new ArrayList<>();
		for (String string : liste1) {
			liste3.add(string);
		}
		for (String string : liste2) {
			liste3.add(string);
		}
		
		//affichage liste3
		System.out.println("affichage liste3 : ");
		for (String string : liste3) {
			System.out.print(string + ", ");
		}
		System.out.println();
		System.out.println("fin");
		
		

	}

}
