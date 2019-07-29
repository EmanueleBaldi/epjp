package b06.s066;

public class Main {
	public static void main(String[] args) {
		Barker[] barkers = new Barker[2]; // è un array di interfacce, e si crea così: nomeInterfaccia [] nomeArray(è la
											// mia reference) = new nomeInterfaccia[dimensione array]

		barkers[0] = new Fox();
		barkers[1] = new Dog();

		for (Barker barker : barkers) {
			System.out.println(barker.bark());
		}

		BarkAndWag baw = new Dog(); // qui invece ho: Interfaccia ReferenceInterfaccia = new Oggetto (un nuovo dog)
		System.out.println(baw.tailWaggingSpeed());

		Dog dog = new Dog(); // qui invece faccio riferimento alla classe Dog e non all'interfaccia BarkAndWag
		System.out.println(dog.bark(3));
	}
}
