package fr.diginamic.banque.entites;

public class Credit extends Operation {
	

	public Credit(String dateOperation, float montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return getType() + " " + super.toString();
	}
	
	@Override
	public String getType() {
		return CREDIT;
		
	}

}
