package main.java.pl.dopierala.OOP.company.writer;

import main.java.pl.dopierala.OOP.company.Company;
import main.java.pl.dopierala.OOP.company.CompanyUtils;
import main.java.pl.dopierala.OOP.company.Employee;

public class TxtEmployeeWriter extends EmployeeWriter {

    @Override
    public void writeEmployees(Company company) {
        CompanyUtils.saveEmployes(company.getEmployees(),getPath());
    }

    public TxtEmployeeWriter(String path) {
        super(path);
    }

}
