package fr.diginamic.entites;

public class Theatre {
	private String nom;
	private int capaciteMax;
	private int totalClientsInscrits = 0;
	private float recetteTotale = 0;

	public Theatre(String nom, int capaciteMax) {
		super();
		this.nom = nom;
		this.capaciteMax = capaciteMax;
	}

	public String inscrire(int nombreClients, float prixPlace) {

		if (totalClientsInscrits + nombreClients > capaciteMax) {
			System.out.println("demandes d'inscription : " + nombreClients);
			System.out.println(toString());

			System.out.println("attention, la capacité max de " + capaciteMax + " est atteinte,");
			System.out.println("le groupe ne peut pas être inscrit !");
			return "alerte !";
		}
		totalClientsInscrits += nombreClients;
		recetteTotale += (nombreClients * prixPlace);
		System.out.println(toString());
		return "ok";
	}

	@Override
	public String toString() {
		return "Theatre [nom=" + nom + ", capaciteMax=" + capaciteMax + ", totalClientsInscrits=" + totalClientsInscrits
				+ ", recetteTotale=" + recetteTotale + "]";
	}

	public float getRecetteTotale() {
		return recetteTotale;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public int getTotalClientsInscrits() {
		return totalClientsInscrits;
	}

}
