package Esercizio;

public class Villan extends Person {
	private int power;

	public Villan(String name, int energy, int power) {
		super(name, energy);
		this.power = power;
	}

	public void shoot(Person p) {

	}

	@Override
	public String toString() {
		return "Villan [power=" + power + ", getName()=" + getName() + ", getEnergy()=" + getEnergy() + "]";
	}

}
