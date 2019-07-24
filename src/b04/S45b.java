package b04;

public class S45b {

	public static void main(String[] args) {
		String a = "Accenture";
		String b = "Overnet Education";
		// 1
		System.out.println("1) " + a.charAt(0)); // restituisce il carattere relativo all'indice indicato fra ()
		// 2
		System.out.println("2) " + a.compareTo(b)); // valore<0 -> b è alfabeticamente successivo ad a
		// 3
		System.out.println("3) " + a.concat(b)); // unisce a e b
		// 4
		System.out.println("4) " + a.contains("Acc")); // mi dice se a contiene la stringa fra () (SOLO VALORI
														// CONSECUTIVI!!!!)
		// 5
		System.out.println("5) " + a.equals(b)); // confronta a e b per vedere se sono uguali
		// 6
		System.out.println("6) " + a.indexOf('c')); // 6 e 7 sono uguali, cambia il modo in cui lo interrogo. nel 6
													// sottoforma di intero infatti il valore è fra ''
		// 7
		System.out.println("7) " + a.indexOf("c")); // nel 7 sottoforma di stringa infatti il valore è fra "". la
													// risposta è la stessa
		// 8
		System.out.println("8) " + a.isEmpty()); // chiedo se la stringa a è vuota
		// 9
		System.out.println("9) " + a.lastIndexOf("e")); // chiedo l'indice dell'ultima e nella stringa a
		// 10
		System.out.println("10) " + a.length()); // chiedo la lunghezza della stringa a
		// 11
		System.out.println("11) " + a.replace("e", "E")); // rimpiazzo e con E nella stringa a
		// 12
		String[] b2 = b.split(" ");
		System.out.println("12a) " + b2);
		for (String parole : b2) {
			System.out.println("12b) " + parole); // divido le parole separate da spazio, il ciclo è necessario per non
		} // avere una stampa come nel 12a)
		// 13
		System.out.println("13) " + a.substring(1)); // inserendo un solo valore dell'indice chiedo la parte di stringa
														// rimanente da quell'indice COMPRESO in poi
		// 14
		System.out.println("14) " + a.substring(0, 3)); // inserendo due indici chiedo la parte di stringa compresa fra
														// loro (IL PRIMO INCLUSO e IL SECONDO NO!!!!!)
		// 15
		System.out.println("15) " + a.toLowerCase()); // mette tutta la stringa in minuscolo
		// 16
		System.out.println("16) " + a.toUpperCase()); // mette tutta la stringa in maiuscolo
		// 17
		String c = "          Emanuele Baldi          ";
		System.out.println("17) " + c.trim()); // toglie gli spazi all'inizio e alla fine di una stringa (NON QUELLI NEL
												// MEZZO!!!)
		// 18
		System.out.println("18) " + String.join(" ", b2)); // rimette sulla stessa riga le parole splittate. il primo
															// parametro da inserire è quello in base al principio
															// tramite il quale sono state separate le parole (spazio,
															// virgolo, ecc.) il secondo parametro è il riferimento alla
															// stringa SPLITTATA da rimettere insieme
		//19
		System.out.println("19) " + String.valueOf(a)); //restituisce il valore di una stringa
		
/* String.format (vedi S44Chicken)		
		public String toString() {

		String result; // = "[" + name + "," + weight + "," + female + "]";

			result = String.format("%s, %.2f, %b", name, weight, female); // i primi tre parametri servono per specificare
																			// il "template" dei parametri successivi (es
																			// %s->string, %f->float, ecc.) i successivi
																			// parametri sono il nome appunto dei formati
																			// specificati. il .2 rappresenta il numero dei
																			// decimali che voglio

			return result;
		}
*/	
	}

}
