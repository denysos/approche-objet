package fr.diginamic.banque.entites;

/**
 * tp 8-héritage-et-méthodes-abstraites
 * 
 * @author denis
 *
 */

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operation[] tableauOperations = new Operation[4];
		tableauOperations[0] = new Debit("2021/10/12", 15.50F);
		tableauOperations[1] = new Debit("2021/10/13", 35.50F);
		tableauOperations[2] = new Credit("2021/10/14", 10.00F);
		tableauOperations[3] = new Debit("2021/10/15", 150.00F);

		for (int i = 0; i < tableauOperations.length; i++) {
			System.out.println(i + " " + tableauOperations[i].toString());
		}

		System.out.println("montant global : " + montantGlobal(tableauOperations));
	}

	public static float montantGlobal(Operation[] tableau) {
		float total = 0F;
		int signeOperation = 1;
		for (int i = 0; i < tableau.length; i++) {

			if (tableau[i].getType() == Operation.DEBIT) {
				signeOperation = -1;
			}

			if (tableau[i].getType() == Operation.CREDIT) {
				signeOperation = 1;
			}

			total += tableau[i].getMontant() * signeOperation;
		}

		return total;
	}

}
