package main.java.pl.dopierala.OOP.PlikiIntro;

import java.io.*;

public class PlikiIntro {
    private static final String FILE_PATH = "C:\\Users\\piotr\\IdeaProjects\\SDA_Lekcja5_OOP_intro\\src\\file.txt";

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
            String linia;

            while((linia=br.readLine())!=null){
                System.out.println(linia);
            }

            //System.out.println("Druga opcja.");
            //br.lines().forEach(System.out::println);
        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}
