package Esercizio;

public class Villain extends Person {
	private int power;

	public Villain(String name, int energy, int power) {
		super(name, energy);
		this.power = power;
	}

	public void shoot(Person p) {
		p.changeEnergy(-power);
	}

	@Override
	public String toString() {
		return "Villain [power=" + power + ", getName()=" + getName() + ", getEnergy()=" + getEnergy() + "]";
	}

}
