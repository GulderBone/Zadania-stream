package nif;

import java.util.List;
import java.util.stream.Collectors;

public class Filtrowanie {
    public static List<String> transform(List<String> list) {
        return list.stream()
                .filter(element -> element.length() < 4)
                .collect(Collectors.toList()); // Zamień na listę elementów o długości mniejszej niż 4.
    }
}
