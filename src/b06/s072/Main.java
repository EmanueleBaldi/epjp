package b06.s072;

public class Main {
	public static void main(String[] args) {
		Dog[] dogs = { new Dog("primo", 3.15), new Dog("secondo"), new Dog("terzo", 2.28), new Dog("quarto", 5.14),
				new Dog("quinto", 2.42), new Dog("sesto", 7.14), }; // creo un arrey con variabili di tipo Dog

		for (Dog dog : dogs) {
			System.out.println(dog);
		}
		Dog fastestDog = dogs[0]; // sto creando un cane di nome fastestDog mettendoci il cane in posizione zero
									// dell'array di cani dogs
		
		for (Dog dog : dogs) { // quando faccio un ciclo for each il primo valore mi indica il tipo di
								// variabile IN QUESTO CASO è DI TIPO DOG (poteva essere string, int, double)
								// .... in questo caso il tipo di variabile lo vedo quando creo l'array alla
								// riga 5

			if (dog.getSpeed() > fastestDog.getSpeed()) { // sto facendo un confronto fra dog, che sono le singole
															// posizioni dell'array dogs (come ho indicato nel for
															// each), e fastestDog
				fastestDog = dog;
			}
		}
		System.out.println("fastest: " + fastestDog);
	}
}