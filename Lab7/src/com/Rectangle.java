package com;

public class Rectangle extends Figure{

    private double a;

    private double b;

    Rectangle() {
        this.a= this.b=1;
    }

    Rectangle(double a, double b) {
        this.a=a;
        this.b=b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }
}
