package ex;

public class Dipendente extends Persona {
	private double stipendio;

	public Dipendente(String name, String surname, double stipendio) {
		super(name, surname);
		this.stipendio = stipendio;
	}

	public double getStipendio() {
		return stipendio;
	}

	@Override
	public String toString() {
		return "Dipendente [stipendio=" + stipendio + ", getName()=" + getName() + ", getSurname()=" + getSurname()
				+ "]";
	}

}