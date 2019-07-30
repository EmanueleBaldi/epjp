package b06.s072;

public class Dog extends Pet {
	private double speed;

	public Dog(String name) {
		this(name, 0);
	}

	public Dog(String name, double speed) {
		super(name);
		this.speed = speed;
	}

	public double getSpeed() { // il getSpeed permette di dare l'accesso ad una variabile in un'altra classe
								// che altrimenti non sarebbe accedibile in quanto private. infatti in questo caso
								// speed è private, e quindi è necessario fare il getSpeed per poterla rendere
								// accessibile alla classe Main (SI FA DA SOURCE !!!!!!! )
		return speed;
	}

	@Override
	public String toString() {
		return "Dog [speed=" + speed + ", getName()=" + getName() + "]"; // RICORDA: il toString si fa da source !!!!!!!
	}

}