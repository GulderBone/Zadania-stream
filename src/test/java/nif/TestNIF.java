package nif;

import nif.Model.Osoba;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static nif.Podzial.podziel;
import static nif.Statystyki.getStats;
import static nif.Sum.policzSume;
import static org.assertj.core.api.Assertions.assertThat;


/*
Filter collection so that only elements with less then 4 characters are returned.
 */
public class TestNIF {

    List<Osoba> collection;

    @Before
    public void prepare() {
        Osoba sara = new Osoba("Sara", 4);
        Osoba viktor = new Osoba("Viktor", 40);
        Osoba eva = new Osoba("Eva", 42);
        collection = asList(sara, eva, viktor);
    }

    @org.junit.Test
    public void NaDuzeLitery() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        assertThat(NaDuzeLitery.transform(collection)).hasSameElementsAs(expected);
    }

    @org.junit.Test
    public void Filtrowanie() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("My", "is", "Doe");
        assertThat(Filtrowanie.transform(collection)).hasSameElementsAs(expected);
    }

    @org.junit.Test
    public void Podlista() {
        List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
        List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
        assertThat(Podlista.transform(collection)).hasSameElementsAs(expected);
    }

    @org.junit.Test
    public void Grupowanie() {
        Osoba sara = new Osoba("Sara", 4, "Norwegian");
        Osoba viktor = new Osoba("Viktor", 40, "Serbian");
        Osoba eva = new Osoba("Eva", 42, "Norwegian");
        List<Osoba> collection = asList(sara, eva, viktor);
        Map<String, List<Osoba>> result = Grupowanie.transform(collection);
        assertThat(result.get("Norwegian")).hasSameElementsAs(asList(sara, eva));
        assertThat(result.get("Serbian")).hasSameElementsAs(asList(viktor));
    }

    @org.junit.Test
    public void Laczenie() {
        Osoba sara = new Osoba("Sara", 4);
        Osoba viktor = new Osoba("Viktor", 40);
        Osoba eva = new Osoba("Eva", 42);
        List<Osoba> collection = asList(sara, viktor, eva);
        assertThat(Laczenie.transform(collection))
                .isEqualTo("Names: Sara, Viktor, Eva, ");
    }

    @org.junit.Test
    public void Dzieci() {
        Osoba sara = new Osoba("Sara", 4);
        Osoba viktor = new Osoba("Viktor", 40);
        Osoba eva = new Osoba("Eva", 42);
        Osoba anna = new Osoba("Anna", 5);
        List<Osoba> collection = asList(sara, eva, viktor, anna);
        assertThat(Dzieci.transform(collection))
                .contains("Sara", "Anna")
                .doesNotContain("Viktor", "Eva");
    }


    @org.junit.Test
    public void Najstarszy() {
        Osoba sara = new Osoba("Sara", 4);
        Osoba viktor = new Osoba("Viktor", 40);
        Osoba eva = new Osoba("Eva", 42);
        List<Osoba> collection = asList(sara, eva, viktor);
        assertThat(Najstarszy.transform(collection)).isEqualTo(42);
    }


    @org.junit.Test
    public void Podzial2() {
        Osoba sara = new Osoba("Sara", 4);
        Osoba viktor = new Osoba("Viktor", 40);
        Osoba eva = new Osoba("Eva", 42);
        List<Osoba> collection = asList(sara, eva, viktor);
        Map<Boolean, List<Osoba>> result = podziel(collection);
        assertThat(result.get(true)).hasSameElementsAs(asList(viktor, eva));
        assertThat(result.get(false)).hasSameElementsAs(asList(sara));
    }

    @org.junit.Test
    public void Statystyki() {
        AssertionsForClassTypes.assertThat(getStats(collection).getAverage())
                .isEqualTo((double)(4 + 40 + 42) / 3);
        AssertionsForClassTypes.assertThat(getStats(collection).getCount())
                .isEqualTo(3);
        AssertionsForClassTypes.assertThat(getStats(collection).getMax())
                .isEqualTo(42);
        AssertionsForClassTypes.assertThat(getStats(collection).getMin())
                .isEqualTo(4);
        AssertionsForClassTypes.assertThat(getStats(collection).getSum())
                .isEqualTo(40 + 42 + 4);
    }

    @Test
    public void Suma() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        assertThat(policzSume(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
    }

}
