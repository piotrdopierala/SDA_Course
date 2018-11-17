package SDA_Algorytmy.pl.dopierala.Homework_personDB;

import SDA_Algorytmy.pl.dopierala.Homework_personDB.MyList.MyList;

import java.util.ArrayList;

public class PersonsDB {
    MyList<Person> personArray = new MyList<>();
    ArrayList<Person> personByName = new ArrayList<>();
    ArrayList<Person> personByLastName = new ArrayList<>();

    public void addPerson(Person p){
        personArray.addLast(p);
    }

    MyList<Person> findAll() {
        return personArray;
    }

    ArrayList<Person> findAllSortByName() {
        return personByName;
    }

    ArrayList<Person> findAllSortByLastName(){
        return personByLastName;
    }


    private int compareByName(Person p , Person q){
        return p.getName().compareTo(q.getName());
    }

    private int compareByLastName(Person p, Person q){
        return p.getLastName().compareTo(q.getLastName());
    }


}
