package SDA_Algorytmy.pl.dopierala.Homework_personDB;

import SDA_Algorytmy.pl.dopierala.Homework_personDB.MyList.MyList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonsDB {
    MyList<Person> personArray = new MyList<>();
    ArrayList<Person> personByName = new ArrayList<>(); //best to use b-tree
    ArrayList<Person> personByLastName = new ArrayList<>(); //best to use b-tree

    public void addPerson(Person p) {
        personArray.addLast(p);
        personByName.add(p);
        personByName.sort(this::compareByName);
        personByLastName.add(p);
        personByLastName.sort(this::compareByLastName);

    }

    MyList<Person> findAll() {
        return personArray;
    }

    ArrayList<Person> findAllSortByName() {
        return personByName;
    }

    ArrayList<Person> findAllSortByLastName() {
        return personByLastName;
    }

    ArrayList<Person> findByBirthDate(LocalDate date) {
        return new ArrayList<>(
                Arrays.<Person>asList(
                        personByName.stream()
                                .filter(p -> p.getBirthDate().equals(date))
                                .toArray((p) -> new Person[p])
                ));
    }

    ArrayList<Person> findByLastName(String lastName) {
        return new ArrayList<>(
                Arrays.<Person>asList(
                        personByLastName.stream()
                                .filter(p -> p.getLastName().equals(lastName))
                                .toArray(p -> new Person[p])
                ));
    }

    ArrayList<Person> findByName(String name) {
        Person[] tbl;
        tbl = (
                personByName.stream()
                        .filter(p -> p.getName().equals(name))
                        .toArray(s -> new Person[s])
        );

        return new ArrayList<Person>(Arrays.asList(tbl));

    }


    private int compareByName(Person p, Person q) {
        return p.getName().compareTo(q.getName());
    }

    private int compareByLastName(Person p, Person q) {
        return p.getLastName().compareTo(q.getLastName());
    }


}
