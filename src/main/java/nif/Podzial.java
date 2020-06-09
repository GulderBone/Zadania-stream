package nif;

import nif.Model.Osoba;

import java.util.*;

public class Podzial {

    private Podzial() {
    }

    public static Map<Boolean, List<Osoba>> partitionAdults7(List<Osoba> people) {
        Map<Boolean, List<Osoba>> map = new HashMap<>();
        map.put(true, new ArrayList<>());
        map.put(false, new ArrayList<>());
        for (Osoba person : people) {
            map.get(person.getAge() >= 18).add(person);
        }
        return map;
    }

    public static Map<Boolean, List<Osoba>> podziel(List<Osoba> people) {
        return null; // podziel osoby na dzieci i dorosłych (<18 lat i więcej 18 lat), stwórz mapę obiektów.
    }

}
