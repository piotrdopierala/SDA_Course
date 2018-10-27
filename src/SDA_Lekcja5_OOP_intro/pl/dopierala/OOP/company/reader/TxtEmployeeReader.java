package main.java.pl.dopierala.OOP.company.reader;

import main.java.pl.dopierala.OOP.company.Company;
import main.java.pl.dopierala.OOP.company.CompanyUtils;
import main.java.pl.dopierala.OOP.company.Employee;

public class TxtEmployeeReader extends EmployeeReader {

    public TxtEmployeeReader(String path) {
        super(path);
    }

    @Override
    public Company readEmployees() {
        Company loadedCompany = new Company("Company From txt file");
        Employee[] loadedEmployees = CompanyUtils.loadEmployes(getPath());
        for (Employee e: loadedEmployees) {
            loadedCompany.addEmployee(e);
        }
        return loadedCompany;
    }
}
