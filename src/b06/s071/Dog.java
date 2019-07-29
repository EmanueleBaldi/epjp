package b06.s071;

public class Dog {

	static final int DEFAULT_WEIGHT = 15;
	static final String DEFAULT_NAME = "Unknown";
	private String name;
	private int weight;

	public Dog(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public Dog() {
//		this (DEFAULT_NAME, DEFAULT_WEIGHT);    potevo anche scriverlo così l'importante è che fra quello sopra
											 // e questo uno delle due inizializzi weight e name
		this.name = DEFAULT_NAME;
		this.weight = DEFAULT_WEIGHT;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", weight=" + weight + "]";
	}

}