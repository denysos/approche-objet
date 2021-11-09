package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	private double salaireMensuel = 0;

	@Override
	public double getSalaire() {
		return salaireMensuel;
	}

	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}

//	private String donneesSpecialisees() {}
	@Override
	protected String donneesSpecialisees() {
		return "remuneration : " + Double.toString(salaireMensuel) + " Statut : Salarié";
	}

}
