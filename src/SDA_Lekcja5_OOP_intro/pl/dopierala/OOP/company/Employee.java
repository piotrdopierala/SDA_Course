package main.java.pl.dopierala.OOP.company;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


public class Employee {
    private static int idGenerator = 1;
    @XmlAttribute
    private int id;
    private String name;
    private String surname;
    private String address;
    private String email;
    private double salary;

    public Employee(String name, String surname) {
        this.id = idGenerator++;
        this.name = name;
        this.surname = surname;
    }

    private Employee(){}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%s,%s,%s,%f\n",
                id,
                name,
                surname,
                email,
                address,
                salary
        );
    }

}

