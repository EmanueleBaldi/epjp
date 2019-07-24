package b04;

public class S44Chicken {
	static final double DEFAULT_WEIGHT = 1.0; // con final identifico una costante
	static final String DEFAULT_NAME = "Unknown";
	String name; // name variabile d'istanza
	double weight;
	boolean female; // solitamente boolean è settato su falso ma in questo caso lo settiamo noi come
					// vero nel costruttore

	// costruttore c1
	public S44Chicken(String name) { // name parametro

		this.name = name; // serve per assegnare il nome dal name parametro al name variabile d'istanza
		this.weight = DEFAULT_WEIGHT;
		this.female = true;
	}

	// costruttore c3
	public S44Chicken(String name, double weight) { // name parametro

		this.name = name; // serve per assegnare il nome dal name parametro al name variabile d'istanza
		this.weight = weight;
		this.female = true;
	}

	// costruttore c2 (costruttore di default)
	public S44Chicken() {

		this.name = DEFAULT_NAME;
		this.weight = DEFAULT_WEIGHT;
		this.female = true;
	}

	// costruttore c4
	public S44Chicken(String name, double weight, boolean female) {

		this.name = name;
		this.weight = weight;
		this.female = false;
	}

	@Override // lo creo dal menu Source->GenerateToString() e serve per dare le indicazioni
				// di come stampare a video nella classe S44Main
	public String toString() {
		return "S44Chicken [name=" + name + ", weight=" + weight + ", female=" + female + "]";
	}
}