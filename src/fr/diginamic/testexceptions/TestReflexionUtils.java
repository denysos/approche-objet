package fr.diginamic.testexceptions;

public class TestReflexionUtils {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Ville ville = new Ville("Paris", 2000);

		try {
			ReflexionUtils.afficherAttributs(ville);

		} catch (IllegalArgumentException | IllegalAccessException e) {
			System.out.println(e);
		} catch (ReflectionException e) {
			// TODO: handle exception
			System.out.println(e + " pb reflection ! ! ! ! ! ! ! ! !");
		}

		try {
			ReflexionUtils.afficherAttributs(null);

		} catch (IllegalArgumentException | IllegalAccessException e) {
			System.out.println(e);
		} catch (ReflectionException e) {
			// TODO: handle exception
			System.out.println(e + " pb reflection ! ! ! ! ! ! ! ! !");
		}

	}

}
