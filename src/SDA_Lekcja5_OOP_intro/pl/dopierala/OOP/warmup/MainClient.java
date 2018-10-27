package main.java.pl.dopierala.OOP.warmup;

import java.util.Random;
import java.util.Stack;

public class MainClient {
    public static void main(String[] args) {

        Figure f1;

        f1=new Square(40);

        ((Square) f1).squareSpecificFunction();

        f1=new Circle(10);


        f1.getArea();
        f1.getCircumference();

    }
}
