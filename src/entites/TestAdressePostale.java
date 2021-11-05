package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale adr1 = new AdressePostale(10, "rue de la bise", 30000, "Nimes");
//		adr1.numeroDeRue = 10;
//		adr1.libelleDeLaRue = "rue de la bise";
//		adr1.codePostal = 30000;
//		adr1.ville = "Nimes";
				
		AdressePostale adr2 = new AdressePostale(12, "rue du pont",34000, "Montpellier");
//		adr2.numeroDeRue = 12;
//		adr2.libelleDeLaRue = "rue du pont";
//		adr2.codePostal = 34000;
//		adr2.ville = "Montpellier";
		
		System.out.println("TestAdressePostale executé !!");
		System.out.println(adr1);
		System.out.println(adr2);
	}

}
