package b04;

//LA DIFFERENZA PRINCIPALE FRA METODI DI STRING E QUELLI DI STRINGBUILDER è CHE ESSENDO LE STRINGHE IMMUTABILI NEL PRIMO 
//CASO VENGONO SEMPRE CREATE NUOVE STRINGHE MENTRE NELLE STRINGBUILDER LA STRINGA VIENE CONTINUAMENTE SOVRASCRITTA
//IN QUANTO SONO MUTABILI

//CON StringBuilder sb = new StringBuilder(10) creo un oggetto StringBuilder di dimensione 10
//CON StringBuilder sb = new StringBuilder() creo un oggetto StringBuilder di dimensione 16 per default

public class S46b {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Emanuele");

		// 1
		System.out.println("1) " + sb.append(" Baldi"));
		// 2
		System.out.println("2) " + sb.charAt(5));
		// 3
		System.out.println("3) " + sb.delete(3, 9));
		// 4
		System.out.println("4) " + sb.insert(0, "E.B. "));
		// 5
		System.out.println("5) " + sb.replace(0, 9, "e b"));
		// 6
		System.out.println("6) " + sb.reverse());

	}

}
