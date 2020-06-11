package nif;

import nif.Model.Osoba;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Dzieci {
    public static Set<String> transform(List<Osoba> people) {
        return people.stream()
                .filter(person -> person.getAge() < 18)
                .map(Osoba::getName)
                .collect(Collectors.toSet());  // Stwórz zbiór imion dzieci (czyli osób poniżej 18 lat)
    }
}
