package SDA_Algorytmy.pl.dopierala.lesson12.Person;

public class Person implements Comparable<Person> {
    String name;
    String lastname;
    String birthdate;
    public static int sortType = 0;

    public Person(String name, String lastname, String birthdate) {
        this.name = name;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", name, lastname, birthdate);
    }

    public static Person[] exampleArray(){
        Person[] persons = new Person[6];
        persons[0] = new Person("Piotr","Dopierala","05-11-1984");
        persons[1] = new Person("Stefan","Brzeczyk","11-12-2000");
        persons[2] = new Person("Andrzej","Kowal","11-12-2012");
        persons[3] = new Person("Bartek","Zozol","11-12-1976");
        persons[4] = new Person("Jarek","Buc","11-12-1993");
        persons[5] = new Person("Adam","Krzyminski","11-12-1993");

        return persons;
    }

    @Override
    public int compareTo(Person o) {
        //return (this.name+this.lastname).compareTo((o.name+o.lastname));
        if(sortType==0)
            return this.name.compareTo(o.name);
        if(sortType==1)
            return this.lastname.compareTo(o.lastname);
        if(sortType==2)
            return this.birthdate.compareTo(o.birthdate);
        return 0;
    }
}
