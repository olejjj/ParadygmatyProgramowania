package pl.kolejnik.datamodels;

public class Person implements IComparableObject{

    //pola
    private String name;
    private String surname;
    private String pesel;

    //konstruktory
    public Person(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    //gettery
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    //

    @Override
    public int compareTo(IComparableObject other) {

        Person otherPerson = (Person) other; //rzutujemy IComparableObject na Person.

        int nameCompare = this.name.compareTo(otherPerson.name);
        if (nameCompare != 0){
            return nameCompare;
        }
        return this.surname.compareTo(otherPerson.surname);
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + pesel;
    }
}
