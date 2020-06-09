package nif;

import nif.Model.Osoba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grupowanie {

    private Grupowanie() {
    }

    public static Map<String, List<Osoba>> groupByNationality7(List<Osoba> people) {
        Map<String, List<Osoba>> map = new HashMap<>();
        for (Osoba person : people) {
            if (!map.containsKey(person.getNationality())) {
                map.put(person.getNationality(), new ArrayList<>());
            }
            map.get(person.getNationality()).add(person);
        }
        return map;
    }

    public static Map<String, List<Osoba>> grupujPoKrajach(List<Osoba> people) {
        return null; // pogrupuj po narodowościach
    }

}
