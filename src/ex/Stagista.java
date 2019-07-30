package ex;

public class Stagista extends Persona {
	private double rimborso;

	public Stagista(String name, String surname, double rimborso) {
		super(name, surname);
		this.rimborso = rimborso;
	}

	public double getRimborso() {
		return rimborso;
	}

	@Override
	public String toString() {
		return "Stagista [rimborso=" + rimborso + ", getName()=" + getName() + ", getSurname()=" + getSurname() + "]";
	}
}