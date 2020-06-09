package nif;

import java.util.List;

public class Sum {

    private Sum() {
    }

    public static int calculate7(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int policzSume(List<Integer> people) {
        return 0; // Zwroc sume elementów;
    }

}
