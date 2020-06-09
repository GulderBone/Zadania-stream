package nif;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Filtrowanie {

    private Filtrowanie() {
    }

    public static List<String> transform7(List<String> collection) {
        List<String> newCollection = new ArrayList<>();
        for (String element : collection) {
            if (element.length() < 4) {
                newCollection.add(element);
            }
        }
        return newCollection;
    }

    public static List<String> transform(List<String> collection) {
        return null; // zamień na strumień filtrujący elementy o długości mniejszej niż 4 i łączące je w listę
    }

}
