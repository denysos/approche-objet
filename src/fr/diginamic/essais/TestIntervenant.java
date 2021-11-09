package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salarie salarie =new Salarie("Jean", "Paul", 2000.0D);
		System.out.println("Salaire salarie : " + salarie.getSalaire());
		
		Pigiste pigiste =new Pigiste("Georgette", "Dupont", 10, 500);
		System.out.println("Salaire pigiste : " + pigiste.getSalaire());
		
		salarie.afficherDonnees();
		pigiste.afficherDonnees();
	}

}
