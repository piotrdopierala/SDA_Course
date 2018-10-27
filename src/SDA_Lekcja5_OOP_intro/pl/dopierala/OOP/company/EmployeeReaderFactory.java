package main.java.pl.dopierala.OOP.company;

import main.java.pl.dopierala.OOP.company.reader.EmployeeReader;
import main.java.pl.dopierala.OOP.company.reader.TxtEmployeeReader;
import main.java.pl.dopierala.OOP.company.reader.XmlEmployeeReader;

public class EmployeeReaderFactory {
    public static EmployeeReader createEmployeeReader(String path){
        if(path.endsWith("txt"))
            return new TxtEmployeeReader(path);
        else
            if(path.endsWith("xml"))
                return new XmlEmployeeReader(path);
            else
                throw new RuntimeException("Cannot create Reader - format not supported.");
    }
}
