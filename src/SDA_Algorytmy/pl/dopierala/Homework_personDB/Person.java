package SDA_Algorytmy.pl.dopierala.Homework_personDB;

import java.util.Date;

public class Person implements UniqID,Comparable<Person> {
    private static int idGenerator=0;
    private int id;
    private String name;
    private String lastName;
    private Date birthDate;

    public Person(String name, String lastName, Date birthDate) {
        this.id=idGenerator++;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
