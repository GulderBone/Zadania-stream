package nif;

import nif.Model.Osoba;

import java.util.List;

public class Najstarszy {
    public static int transform(List<Osoba> people) {
        return people.stream()
                .map(Osoba::getAge)
                .max(Integer::compareTo).get(); // Znajdź wiek najstarszej osoby z listy.
        // użyj .get() na końcu, jest to związane z Optionalami, będziemy o nich mówić.
    }
}
