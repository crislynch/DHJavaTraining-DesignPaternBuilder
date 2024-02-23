//Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici
//(tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video
public class Main {
    public static void main(String[] args) {
        //Creare due oggetti Person e stamparli a video
        PersonBuilder builder1 = new PersonBuilder("Mario", "Rossi");
        builder1.age(26);
        builder1.address("via dei pini 1");
        Person person1 = builder1.build();

        System.out.println(person1);



        PersonBuilder builder2 = new PersonBuilder("Luigi", "Bianchi");
        builder2.age(43);
        Person person2 = builder2.build();

        System.out.println(person2);
    }
}