package nif;

import nif.Model.Osoba;

import java.util.List;

public class Najstarszy {

    public static Osoba getOldestPerson7(List<Osoba> people) {
        Osoba oldestPerson = new Osoba("", 0);
        for (Osoba person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

    public static Osoba getNajstarszy(List<Osoba> people) {
        return null; // Znajdź najastarszego
    }

}
