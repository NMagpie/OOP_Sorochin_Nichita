package com;

public class Square extends Figure{

    private double a;

    Square() {
        this.a=1;
    }

    Square(double a) {
        this.a=a;
    }

    @Override
    public double getArea() {
        return Math.pow(a,2);
    }

    @Override
    public double getPerimeter() {
        return 4*a;
    }
}
