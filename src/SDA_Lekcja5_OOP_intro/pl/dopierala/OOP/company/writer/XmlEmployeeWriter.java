package main.java.pl.dopierala.OOP.company.writer;

import main.java.pl.dopierala.OOP.company.Company;
import main.java.pl.dopierala.OOP.company.Employee;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class XmlEmployeeWriter extends EmployeeWriter {

    @Override
    public void writeEmployees(Company company) {
        try {
            JAXBContext jaxb = JAXBContext.newInstance(main.java.pl.dopierala.OOP.company.Company.class);
            Marshaller marshaller = jaxb.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(company,new File(getPath()));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public XmlEmployeeWriter(String path) {
        super(path);
    }

}
