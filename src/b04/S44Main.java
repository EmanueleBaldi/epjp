package b04;

public class S44Main {

	public static void main(String[] args) {
		String s = "Giustina";

		S44Chicken c1 = new S44Chicken(s); // con questo comando chiamo il costruttore
		S44Chicken c2 = new S44Chicken(); // quando non diamo nessun parametro chiamo il costruttore di default
		S44Chicken c3 = new S44Chicken("Joan", 497.12);
		S44Chicken c4 = new S44Chicken("Bill", 218.2, false);

		System.out.println(c4.toString() + c3); // una stringa e un oggetto li posso stampare, 2 oggetti no
		System.out.println(c4 + "\n" + c3); // con \n gli chiedo di andare a capo (che rappresenta anche l'elemento
											// stringa che mi permette di non usare toString)
	}

}