package fr.diginamic.recensement;

import java.util.ArrayList;

public class Recensement {
//	private Ville ville;
	final int CODEREGION = 0;
	final int  NOMREGION = 1;
	final int  CODEDEPARTEMENT = 2;
	final int  CODECOMMUNE = 5;
	final int  NOMCOMMUNE = 6;
	final int  POPULATIONTOTALE = 9;

	private ArrayList<Ville> listeVilles = new ArrayList<>();

	public void ajouteVille(String enregistrementVille) {
		String[] villeTableau = enregistrementVille.split(";");

		Ville ville = new Ville(villeTableau[CODEREGION], villeTableau[NOMREGION], villeTableau[CODEDEPARTEMENT], villeTableau[CODECOMMUNE], villeTableau[NOMCOMMUNE], villeTableau[POPULATIONTOTALE]);
		listeVilles.add(ville);

	}

	public Ville recherche(String villeRecherchee) {
		Ville resultat = null;
		for (Ville ville : listeVilles) {
			if (ville.getNomCommune().toLowerCase().equals(villeRecherchee.toLowerCase())) {
				return ville;
			}
		}
		return resultat;
	}
}
