package fr.diginamic.recensement;

public class execRecherchePopulationVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recensement recencement = new Recensement();
		recencement.ajouteVille("84;Auvergne-Rhône-Alpes;01;1;01;008;Ambutrix;750;13;763;");
		recencement.ajouteVille("84;Auvergne-Rhône-Alpes;01;1;10;010;Anglefort;1 124;18;1 142;");
		RecherchePopulationVille recherchePopVille = new RecherchePopulationVille(recencement);

		recherchePopVille.traiter();
	}

}
