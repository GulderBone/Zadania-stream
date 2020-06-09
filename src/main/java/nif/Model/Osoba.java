package nif.Model;

//Klasa pomocnicza,tu nie ma zadania!

public class Osoba {

    private String name;
    private int age;
    private String nationality;

    public Osoba(final String nameValue, final int ageValue) {
        name = nameValue;
        age = ageValue;
    }

    public Osoba(final String nameValue, final int ageValue, final String nationalityValue) {
        name = nameValue;
        age = ageValue;
        nationality = nationalityValue;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

}