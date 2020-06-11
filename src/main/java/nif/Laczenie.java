package nif;

import nif.Model.Osoba;

import java.util.List;

public class Laczenie {
    public static String transform(List<Osoba> people) {
        return people.stream()
                .map(Osoba::getName)
                .reduce("Names: ", (zlaczane, imie) -> zlaczane + imie + ", "); // złacz umiona w jeden string po przecinku
        // Wynik: Names: imie1, imie2, imie3,
    }
}
