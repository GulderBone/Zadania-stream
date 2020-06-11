package nif;

import nif.Model.Osoba;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Podzial {
    public static Map<Boolean, List<Osoba>> transform(List<Osoba> people) {
        return people.stream()
                .collect(Collectors.groupingBy(person -> person.getAge() > 18)); // Podziel osoby na dzieci i dorosłych (<18 lat i >= 18 lat) i  stwórz mapę obiektów.
    }
}
