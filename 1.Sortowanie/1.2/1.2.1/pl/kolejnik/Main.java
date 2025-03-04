package pl.kolejnik;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Person person01 = new Person(18, "Magda");
        Person person02 = new Person(16, "Kamil");
        Person person03 = new Person(26, "Bartek");
        Person person04 = new Person(24, "Filip");
        Person person05 = new Person(13, "Maja");
        Person person06 = new Person(12, "Wiktor");

        List<Person> persons = new ArrayList<>();

        persons.add(person01);
        persons.add(person02);
        persons.add(person03);
        persons.add(person04);
        persons.add(person05);
        persons.add(person06);

        System.out.println("Przed posortowaniem: ");
        Person.printPersons(persons);

        Sort.sortBubble(persons);

        System.out.println("Po posortowaniu: ");
        Person.printPersons(persons);

    }
}
