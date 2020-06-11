package nif;

import java.util.List;
import java.util.stream.Collectors;

public class Podlista {
    public static List<String> transform(List<List<String>> collection) {
        return collection.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList()); // Stwórz jedną listę ze podanej listy list.
        // Podpowiedź, sprawdź jak działa flatMap i użyj go.
    }
}