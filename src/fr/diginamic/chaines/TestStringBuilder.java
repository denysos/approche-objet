package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {

		StringBuilder strB = new StringBuilder();
		String str = "";

		long debut = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			strB.append(i);
		}
		long fin = System.currentTimeMillis();
		System.out.println("temps ecoulé en millisecondes strB : " + (fin - debut));

		long debut2 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			str = str + i;
		}
		long fin2 = System.currentTimeMillis();
		System.out.println("temps ecoulé en millisecondes str : " + (fin2 - debut2));
	}

}
