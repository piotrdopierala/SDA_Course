package main.java.pl.dopierala.OOP.company.reader;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import main.java.pl.dopierala.OOP.company.Company;
import main.java.pl.dopierala.OOP.company.Employee;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext; //--add-modules java.xml.bind added to complier options
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Objects;

public class XmlEmployeeReader extends EmployeeReader {

    public XmlEmployeeReader(String path) {
        super(path);
    }

    @Override
    public Company readEmployees() {
        Company loadedCompany = null;
        try {
            JAXBContext c = JAXBContext.newInstance(Company.class);
            Unmarshaller unmarshaller = c.createUnmarshaller();
            loadedCompany = (Company) unmarshaller.unmarshal(new File(getPath()));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        if (Objects.isNull(loadedCompany))
            return new Company("Empty company.");
        else
            return loadedCompany;
    }

}
