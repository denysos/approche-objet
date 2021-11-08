package utils;

/**
 * tp 7-héritage-et-constructeur
 * @author denis
 *
 */

public class TestMethodeStatic {

	public static void main(String[] args) {
		String chaine = "12";
		int entier;
		int a = 10;
		int b = 15;
		int max;
		
		entier = Integer.valueOf(chaine);  // fait la même chose que parseInt()
		max = Integer.max(a, b);
		
		System.out.println("cette chaine : \"" + chaine + "\" a été convertie en entier : " + entier);
		System.out.println("entre " + a + " et " + b + " le plus grand est : " + max );

	}

}
