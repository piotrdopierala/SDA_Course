package main.java.pl.dopierala.OOP.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;

public class CompanyUtils {

    /**
     * Zapisuje pracownikow do pliku txt
     *
     * @param employes
     * @param path
     * @return zwraca status operacji jesli udalo sie zapisac. true - sukces.
     */
    public static boolean saveEmployes(Employee[] employes, String path) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(path))) {
            for (int i = 0; i < employes.length; i++) {
                Employee employee = employes[i];
                if (employee != null) {
                    writer.write(employee.toString());
                }
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


    public static Employee[] loadEmployes(String path) {
        Employee[] result = new Employee[100];
        int index = 0;

        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(path));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] split = line.split(",");
                Employee employee = new Employee(split[1], split[2]);
                employee.setEmail(split[3]);
                employee.setAddress(split[4]);
                employee.setSalary(Double.valueOf(split[5]));
                result[index++] = employee;
            }
            return result;
        } catch (IOException e) {
            //e.printStackTrace();
            return new Employee[0];
        }
    }
}
