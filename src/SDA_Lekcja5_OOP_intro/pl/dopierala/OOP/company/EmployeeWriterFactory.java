package main.java.pl.dopierala.OOP.company;

import main.java.pl.dopierala.OOP.company.writer.EmployeeWriter;
import main.java.pl.dopierala.OOP.company.writer.TxtEmployeeWriter;
import main.java.pl.dopierala.OOP.company.writer.XmlEmployeeWriter;

public class EmployeeWriterFactory {
    public static EmployeeWriter createEmployeeWriter(String path){
        if(path.endsWith("txt"))
            return new TxtEmployeeWriter(path);
        else
            if(path.endsWith("xml"))
                return new XmlEmployeeWriter(path);
            else
                throw new RuntimeException("Cannot create Reader - format not supported.");
    }
}
