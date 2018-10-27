package main.java.pl.dopierala.OOP.company.writer;

import main.java.pl.dopierala.OOP.company.Company;
import main.java.pl.dopierala.OOP.company.Employee;

import java.util.Objects;

public abstract class EmployeeWriter {
    private String path;

    public abstract void writeEmployees(Company company);

    public EmployeeWriter(String path) {
        this.path = Objects.requireNonNull(path);
    }

    public String getPath() {
        return path;
    }
}
