package fr.diginamic.recensement;

import java.util.Scanner;

import fr.diginamic.recensementexceptions.DepartementInconnuException;
import fr.diginamic.recensementexceptions.NombreIncorrectException;

public class RecherchePopulationBorneService extends MenuService {

	public RecherchePopulationBorneService(Recensement recensement) {
		super();
		this.recensement = recensement;
	}

	private Recensement recensement;
	private String[] departementRecherche;

	@Override
	public void traiter() throws DepartementInconnuException, NombreIncorrectException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("entrez le code de departement à recenser : ");
		String requeteCodeDepartement = scanner.next();

		System.out.println("minimum de population à rechercher : ");
		String requetePopMini = scanner.next();

		try {
			Integer requetePopMiniInt = Integer.parseInt(requetePopMini);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			throw new NombreIncorrectException("toto");
		}
//		if ())) {
//			
//		}

		System.out.println("maximum de population à rechercher : ");
		String requetePopMaxi = scanner.next();
		Integer.parseInt(requetePopMaxi) ;
		

		departementRecherche = rechercher(requeteCodeDepartement);

		if (departementRecherche == null) {
			System.out.println("ville <" + requeteCodeDepartement + "> inconnue");
		} else {

//			afficherPopDepartement();
		}
	}

	private String[] rechercher(String codeDepartement) throws DepartementInconnuException {
		String[] resultat = { "", "", "" };

		if (codeDepartement.equals("30")) {
			resultat[0] = "30";
			resultat[0] = "1000";
			resultat[0] = "2000";
			return resultat;
		} else

		{
			throw new DepartementInconnuException("departement " + codeDepartement + " inconnu !");
		}

	}
}
