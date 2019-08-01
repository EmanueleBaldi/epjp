package Esercizio;

public class Hero extends Person {

	public Hero(String name, int energy) {
		super(name, energy);
	}

	public boolean arrest(Person p) {
		return false;
	}

	@Override
	public String toString() {
		return "Hero [" + getName() + ", getEnergy()=" + getEnergy() + "]";
	}

}
