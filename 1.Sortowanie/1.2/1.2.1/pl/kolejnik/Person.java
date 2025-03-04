package pl.kolejnik;

import java.util.List;

public class Person {

    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(persons.indexOf(person) + 1 + ". " + person.getName() + ", " + "lat " + person.getAge());
            System.out.println();
        }
    }
}
