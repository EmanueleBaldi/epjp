package Esercizio;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		persons.add(new Hero("Hulk", 100));
		persons.add(new Hero("Spiderman", 100));
		persons.add(new Hero("Ironman", 100));
		persons.add(new Villan("Loki", 100, 80));
		persons.add(new Villan("Ultron", 70, 90));
		persons.add(new Villan("Thanos", 60, 100));
		persons.add(new CommonPerson("Mario", 50));
		persons.add(new CommonPerson("Maria", 40));

	}
}
