package Esercizio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		persons.add(new Hero("Hulk", 100));
		persons.add(new Hero("Spiderman", 100));
		persons.add(new Hero("Ironman", 100));
		persons.add(new Villain("Loki", 100, 80));
		persons.add(new Villain("Ultron", 70, 90));
		persons.add(new Villain("Thanos", 60, 100));
		persons.add(new CommonPerson("Mario", 50));
		persons.add(new CommonPerson("Maria", 40));

		List<Person> jail = new ArrayList<>();
		List<Person> alive = new ArrayList<>();
		alive.addAll(persons);
		
		List<Person> dead = new ArrayList<>();
		
		Map<String, Hero> heroes = new HashMap<String, Hero>();
		Hero hulk = null;
		Hero spiderman = null;
		Hero ironman = null;
		heroes.put("Hulk", hulk);
		heroes.put("Spiderman", spiderman);
		heroes.put("Ironman" , ironman);
		
		Map<String, Villain> villains = new HashMap<String, Villain>();
		Villain loki = null;
		Villain ultron = null;
		Villain thanos = null;
		villains.put("Loki", loki);
		villains.put("Ultron", ultron);
		villains.put("Thanos" , thanos);
		
		Map<String, CommonPerson> commons = new HashMap<String, CommonPerson>();
		CommonPerson mario = null;
		CommonPerson maria = null;
		commons.put("Mario", mario);
		commons.put("Maria" , maria);
	}
	}

