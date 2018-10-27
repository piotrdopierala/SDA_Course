package main.java.pl.dopierala.OOP.warmup;

public class Square extends Figure {

    public double side=0;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getCircumference() {
        return 4*side;
    }

    public void squareSpecificFunction(){
    }
}
