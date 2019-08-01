package Esercizio;

public class CommonPerson extends Person {

	public CommonPerson(String name, int energy) {
		super(name, energy);
	}

	@Override
	public String toString() {
		return "CommonPerson [getName()=" + getName() + ", getEnergy()=" + getEnergy() + "]";
	}

}
