package nif;

import nif.Model.Osoba;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grupowanie {
    public static Map<String, List<Osoba>> transform(List<Osoba> people) {
        return people.stream()
                .collect(Collectors.groupingBy(Osoba::getNationality)); // Pogrupuj po narodowościach.
    }
}
