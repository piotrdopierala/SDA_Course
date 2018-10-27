package main.java.pl.dopierala.OOP.company.reader;

import com.sun.istack.internal.NotNull;
import main.java.pl.dopierala.OOP.company.Company;
import main.java.pl.dopierala.OOP.company.Employee;

import java.util.Objects;

public abstract class EmployeeReader {
    private String path;

    @NotNull
    public abstract Company readEmployees();

    public EmployeeReader(String path) {
        this.path = Objects.requireNonNull(path);
    }

    public String getPath() {
        return path;
    }
}
