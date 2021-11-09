package fr.diginamic.chaines;

public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chaine = "Durand;Marcel;2 523.5";

		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);

		System.out.println("longueur chaîne : " + chaine.length());

		int indexPremierPointVirgule = chaine.indexOf(';');
		System.out.println("index du premier ';' : " + indexPremierPointVirgule);

		String nomDeLaPersonne = chaine.substring(0, indexPremierPointVirgule);
		System.out.println("nom de famille de la personne : " + nomDeLaPersonne);

		System.out.println("en majuscules : " + nomDeLaPersonne.toUpperCase());
		System.out.println("en minuscules : " + nomDeLaPersonne.toLowerCase());

		String[] ligneEnTableau = chaine.split(";");
		for (int i = 0; i < ligneEnTableau.length; i++) {
			System.out.println(ligneEnTableau[i]);

		}

	}

}
