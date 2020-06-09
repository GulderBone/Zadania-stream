package nif;

import nif.Model.Osoba;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class Laczenie {

    private Laczenie() {
    }

    public static String namesToString7(List<Osoba> people) {
        String label = "Names: ";
        StringBuilder sb = new StringBuilder(label);
        for (Osoba person : people) {
            if (sb.length() > label.length()) {
                sb.append(", ");
            }
            sb.append(person.getName());
        }
        sb.append(".");
        return sb.toString();
    }

    public static String namesToString(List<Osoba> people) {

        return null; // złacz umiona w jeden string po przecinku
    }

}
