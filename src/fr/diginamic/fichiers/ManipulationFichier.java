package fr.diginamic.fichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Path pathFile = Paths.get("C:/Users/denis/Documents/fichierexo/recensement.csv");
		List<String> lines = Files.readAllLines(pathFile);
		
		Path pathCible = Paths.get("C:/Users/denis/Documents/fichierexo/recensementVilles250.csv");
		
		for (String line : lines) {
			String[] ligne;
			ligne = line.split(";");
			String nbHabitants = ligne[0];
		}
	

	}

}
