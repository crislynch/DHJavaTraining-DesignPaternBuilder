//Creare una classe Builder che attraverso il costruttore e dei metodi specifici
//(tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
public class PersonBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    //(tranne nome e cognome
    public PersonBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //campi opzionali
    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(firstName, lastName, age, address);
    }

    @Override
    public String toString() {
        return "PersonBuilder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
