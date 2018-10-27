package main.java.pl.dopierala.OOP.warmup;

public class Rectangle extends Figure {

    public double side_a=0.0;
    public double side_b=0.0;

    public Rectangle(double side_a, double side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    @Override
    public double getArea() {
        return side_a*side_b;
    }

    @Override
    public double getCircumference() {
        return 2*side_a+2*side_b;
    }
}
