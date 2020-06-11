package nif;

import java.util.List;

public class Sum {
    public static int transform(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, Integer::sum); // Zwróć sumę liczb;
    }
}
