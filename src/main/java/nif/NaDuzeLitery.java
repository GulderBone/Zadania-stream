package nif;

import java.util.List;
import java.util.stream.Collectors;

public class NaDuzeLitery {
    public static List<String> transform(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList()); // Zamień elementy listy na pisane dużymi literami.
    }
}
