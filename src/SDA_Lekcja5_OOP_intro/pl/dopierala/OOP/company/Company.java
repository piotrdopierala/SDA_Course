package main.java.pl.dopierala.OOP.company;

import javax.xml.bind.annotation.*;
import java.util.Objects;

@XmlRootElement
public class Company {
    private static final int MAX_EMPLOYEE_NUM = 100;
    @XmlAttribute(name="nazwa")
    private String companyName;
    @XmlElementWrapper(name="pracownicy")
    @XmlElement(name="pracownik")
    private Employee[] employees;
    private int numOfEmployees = 0; //pokazuje aktualny stan pracownikow i indeks w tablicy, gdzie wstawic nowego pracownika

    public Company(String companyName) {
        this.companyName = companyName;
        this.numOfEmployees = 0;
        this.employees = new Employee[MAX_EMPLOYEE_NUM];
    }

    private Company(){}

    public String getCompanyName() {
        return companyName;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public boolean addEmployee(Employee newEmp) {
        if (numOfEmployees < MAX_EMPLOYEE_NUM && Objects.nonNull(newEmp)) {
            employees[numOfEmployees++] = newEmp;
            return true;
        } else
            return false;
    }

    /**
     * Usuwa pracownika i zwraca referencje do tego pracownika lub zwraca null, jesli nie znaleziono
     *
     * @param id Id pracownika do usuniecia
     * @return usuwany pracownik lub null jesli nie znaleziono
     */
    public Employee delEmployee(int id) {
        Employee empToDelete = null;
        for (int i = 0; i < numOfEmployees; i++) {
            if (employees[i].getId() == id) { //znaleziono pracownika o takim id
                empToDelete = employees[i];
                employees[i]=null;
                numOfEmployees--;
            }
        }

        //usuwanie elementu null ze srodka array
        Employee[] newEmployees = new Employee[MAX_EMPLOYEE_NUM];
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                newEmployees[index] = employees[i];
                index++;
            }
        }
        employees = newEmployees;

        return empToDelete;
    }
}
