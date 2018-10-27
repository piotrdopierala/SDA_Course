package main.java.pl.dopierala.OOP.warmup;

public class Circle extends Figure {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2.0);
    }

    @Override
    public double getCircumference() {
        return 2.0*Math.PI*radius;
    }

    public void circleSpecificFunction(){
    }
}
