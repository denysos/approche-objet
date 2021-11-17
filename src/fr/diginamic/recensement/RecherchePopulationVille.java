package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {
	private Recensement recensement;

	public RecherchePopulationVille(Recensement recensement) {
		super();
		this.recensement = recensement;
	}

	private Ville villerecherchee;

	public void traiter() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("entrez la ville que vous recherchez : ");
		String requeteVille = scanner.next();
		villerecherchee = rechercher(requeteVille);

		if (villerecherchee == null) {
			System.out.println("ville <" + requeteVille + "> inconnue");
		} else {

			afficherPopVille();
		}

	}

	private void afficherPopVille() {
		String nomVille = villerecherchee.getNomCommune();
		String populationVille = villerecherchee.getPopulationTotale();
		System.out.println("[" + nomVille + "] : " + populationVille + " Habitants");

	}

	public Ville rechercher(String villeRecherchee) {
		Ville resultat = null;

		resultat = recensement.recherche(villeRecherchee);

		return resultat;
	}

}
