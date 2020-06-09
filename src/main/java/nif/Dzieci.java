package nif;

import nif.Model.Osoba;

import java.util.*;

import static java.util.stream.Collectors.toSet;

public class Dzieci {

    public static Set<String> getKidNames7(List<Osoba> people) {
        Set<String> kids = new HashSet<>();
        for (Osoba person : people) {
            if (person.getAge() < 18) {
                kids.add(person.getName());
            }
        }
        return kids;
    }

    public static Set<String> getImionaDzieci(List<Osoba> people) {
        return null;  // stwórz zbiór imion dzieci (czyli osób ponizej 18 lat)
    }

}
