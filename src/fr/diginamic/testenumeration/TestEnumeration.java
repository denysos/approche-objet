package fr.diginamic.testenumeration;

import java.util.Iterator;

public class TestEnumeration {

	public static void main(String[] args) {

		Saison[] saisons = Saison.values();
		
		for (Saison saison : saisons) {
		System.out.println(saison);	
		}
		
		System.out.println();
		
		System.out.println("libellé de la saison PRINTEMPS : " + Saison.AUTOMNE.getLibelle());
		
		String nom = "ETE";
		System.out.println("libelle ETE : " + Saison.ETE.getLibelle());
		System.out.println("libelle ETE2 : " + Saison.valueOf(nom).getLibelle());
		
		String libelle = "Hiver";
		
		System.out.println("pour " + libelle + " : " + Saison.coucouSaison(libelle));
		
	}

}
