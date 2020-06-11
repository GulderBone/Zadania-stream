package nif;

import nif.Model.Osoba;

import java.util.IntSummaryStatistics;
import java.util.List;

public class Statystyki {
    public static IntSummaryStatistics transform(List<Osoba> people) {
        return people.stream()
                .mapToInt(Osoba::getAge)
                .summaryStatistics(); // Zwróć statystyki wieku osób, poszukaj w google summaryStatistics().;
    }
}
