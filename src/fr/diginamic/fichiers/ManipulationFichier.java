package fr.diginamic.fichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManipulationFichier {
	static int index = 0;
	static ArrayList<String> listeSortie = new ArrayList<>();
	
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Path pathFile = Paths
				.get("d:/workspace-spring-diginamic/approche-objet/src/fr/diginamic/fichiers/recensement.csv");
		List<String> lines = Files.readAllLines(pathFile);

		Path pathCible = Paths
				.get("d:/workspace-spring-diginamic/approche-objet/src/fr/diginamic/fichiers/recensementVilles250.csv");

		// premiere lecture : ligne entete

		listeSortie.add("nom;departement;population;");

		for (String line : lines) {

			if (index != 0) {
				String ligne = line;
				String[] ligneT = ligne.split(";");
				VillePop ville = new VillePop(ligneT[6], ligneT[2], ligneT[9]);
				if (ville.getPopulation() > 25_000) {
					listeSortie.add(
							ville.getNom() + ";" + ville.getCodeDepartement() + ";" + ville.getPopulationStr() + ";");
				}
			}
			index++;
		}

		Files.write(pathCible, listeSortie);

	}
	
//	static public void solution(lines) {
//	//solution :
//	
//	String ligneEntete = lines.get(0);
//	String[] colonnesEntete = ligneEntete.split(";");
//	String ligneEnteteFinale = colonnesEntete[2] + ";" + colonnesEntete[6] + ";" + colonnesEntete[9] + ";";
//	
//	// premiere lecture : ligne entete
//	for (int i=1;i<lines.size();i++) {
//		String ligne = lines.get(i);
//		String[] ligneT = ligne.split(";");
//		
//		int pop = Integer.parseInt(ligneT[9].replaceAll(" ", ""));
//		
//		
//	}}


}
