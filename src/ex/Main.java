package ex;

public class Main {

	public static void main(String[] args) {
		Persona[] persone = { new Dipendente("Mario", "Rossi", 1_500.35), new Dipendente("Alessio", "Verdi", 4_820.60),
				new Stagista("Luca", "Bianchi", 900.80), new Stagista("Andrea", "Neri", 1_200.64) };
		for (Persona persona : persone) {
			if (persona instanceof Dipendente) {
				System.out.println("Stipendio Dipendente: " + ((Dipendente) persona).getStipendio());
			} else {
				System.out.println("Rimborso Stagista: " + ((Stagista) persona).getRimborso());
			}
		}
	}
}