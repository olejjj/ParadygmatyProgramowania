package pl.kolejnik;

import pl.kolejnik.algorithms.BubbleSort;
import pl.kolejnik.algorithms.MergeSort;
import pl.kolejnik.datamodels.Person;
import pl.kolejnik.datamodels.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Adam", "Nowak", "08400456234"));
        persons.add(new Person("Agnieszka", "Marciniak", "08746536234"));
        persons.add(new Person("Adam", "Kowalski", "08400423934"));
        persons.add(new Person("Jan", "Matejko", "01234562342"));
        persons.add(new Person("Agnieszka", "Wachowiak", "0546273690"));
        persons.add(new Person("Michał", "Kaczmarek", "07658390856"));

        System.out.println("Przed posortowaniem: ");
        for(Person person : persons) {
            System.out.println((persons.indexOf(person) + 1) + ". " + person);
        }

        System.out.println();

        // Przykłady użycia
        new MergeSort().sort(persons);
        new BubbleSort().sort(persons);

        System.out.println("Po posortowaniu: ");
        for(Person person : persons) {
            System.out.println((persons.indexOf(person) + 1) + ". " + person);
        }
        System.out.println();

        List<Product> products = new ArrayList<>();
        products.add(new Product("Telewizor", 2000));
        products.add(new Product("Pralka", 1000));
        products.add(new Product("Lodówka", 3000));
        products.add(new Product("Bidon", 10));

        System.out.println("Przed posortowaniem: ");
        for(Product product : products) {
            System.out.println((products.indexOf(product) + 1) + ". " + product);
        }

        System.out.println();
        // Przykłady użycia
        new MergeSort().sort(products);
        new BubbleSort().sort(products);

        for(Product product : products) {
            System.out.println((products.indexOf(product) + 1) + ". " + product);
        }

    }
}
