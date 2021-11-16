package fr.diginamic.listes;

import java.util.ArrayList;


/**
 * TP10 exo 1 : Apprenez à créer une liste
 * @author denis
 *
 */
public class CreationListe {

//	public static ArrayList<int>	listeEntiers = new ArrayList<>();
//	public static ArrayList<int> listeEntiers = new ArrayList
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> listeEntiers = new ArrayList<>();
//		ArrayList<String> liste= new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			Integer entier;
			entier = i + 1;
			listeEntiers.add(entier);
		}
		
	  System.out.println("taille de la liste : " + listeEntiers.size());
	 
	 
		
	}

}
