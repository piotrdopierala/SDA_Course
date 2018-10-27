package main.java.pl.dopierala.OOP.company;

import main.java.pl.dopierala.OOP.company.reader.EmployeeReader;
import main.java.pl.dopierala.OOP.company.writer.EmployeeWriter;

import java.beans.XMLDecoder;
import java.util.Scanner;

public class Program {
    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Program do zarządzania firmą");
        System.out.println("Podaj nazwę firmy: ");
        String companyName = scn.nextLine();

        Company firma = new Company(companyName);

        int choice = -1;
        while (choice != 0) {
            printMenu();
            choice = scn.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    printEmployees(firma);
                    break;
                case 2:
                    addEmployee(firma);
                    break;
                case 3:
                    delEmployee(firma);
                    break;
                case 4:
                    saveToFile(firma);
                    break;
                case 5:
                    loadFromFile(firma);
                    break;
                default:
                    System.out.println("Nie ma takiej operacji - wybierz ponownie.");
                    break;
            }
            System.out.println();
            System.out.println();

        }
    }

    private static void loadFromFile(Company firma) {
        String path = "prac.txt";
        System.out.println("Wybierz format pliku:");
        System.out.println("1 - TXT");
        System.out.println("2 - XML");
        int formatChoice = scn.nextInt();
        EmployeeReader reader;
        if(formatChoice==1) {
            path="prac.txt";
        }else {
            path="prac.xml";
        }

        reader = EmployeeReaderFactory.createEmployeeReader(path);
        Company loadedCompany = reader.readEmployees();
        for (Employee e: loadedCompany.getEmployees()) {
            firma.addEmployee(e);
        }

    }

    private static void saveToFile(Company firma) {
        //System.out.println("Podaj sciezke do pliku:");
        //String path = scn.next();
        String path = "prac.txt";

        System.out.println("Wybierz format pliku:");
        System.out.println("1 - TXT");
        System.out.println("2 - XML");
        int formatChoice = scn.nextInt();
        EmployeeWriter writer;

        if(formatChoice==1) {
            path="prac.txt";
        }
        if(formatChoice==2){
            path="prac.xml";
        }
        writer = EmployeeWriterFactory.createEmployeeWriter(path);
        writer.writeEmployees(firma);

    }

    private static void delEmployee(Company company) {
        System.out.println("Podaj id pracownika do usuniecia:");
        int idEmpToDelete = scn.nextInt();
        Employee deletedEmployee = company.delEmployee(idEmpToDelete);
        if (deletedEmployee == null) {
            System.out.println("Nie znaleziono takiego pracownika.");
            return;
        }
        System.out.println("Pracownik:"
                + deletedEmployee.getName()
                + ", "
                + deletedEmployee.getSurname()
                + " zostal usuniety."
        );
    }

    private static void addEmployee(Company company) {
        System.out.println("Podaj imie:");
        String inputName = scn.next();
        System.out.println("Podaj nazwisko");
        String inputSureName = scn.next();
        System.out.println("Podaj email");
        String inputEmail = scn.next();
        System.out.println("Podaj pensję");
        double inputSalaty = scn.nextDouble();
        Employee newEmployee = new Employee(inputName, inputSureName);
        newEmployee.setEmail(inputEmail);
        newEmployee.setSalary(inputSalaty);
        company.addEmployee(newEmployee);
    }

    private static void printEmployees(Company company) {
        Employee[] employees = company.getEmployees();
        if (company.getNumOfEmployees() == 0) {
            System.out.println("Brak pracownikow - wybierz opcje 2, aby dodac nowego.");
            return;
        }
        for (int i = 0; i < company.getNumOfEmployees(); i++) {
            Employee p = employees[i];
            String empDescription = String.format(
                    "Id: %d, Imię: %s, Nazwisko: %s, e-mail: %s, pensja: %f",
                    p.getId(),
                    p.getName(),
                    p.getSurname(),
                    p.getEmail(),
                    p.getSalary()
            );
            System.out.println(empDescription);
        }
    }

    private static void printMenu() {
        System.out.println("Wybierz operację:");
        System.out.println("1. Wypisz wszystkich pracownikow");
        System.out.println("2. Dodaj nowego pracownika");
        System.out.println("3. Usuń pracownika");
        System.out.println("4. Zapisz pracownikow do pliku");
        System.out.println("5. Wczytaj pracownikow z pliku");
        System.out.println("0. Wyjście z programu");
    }
}
