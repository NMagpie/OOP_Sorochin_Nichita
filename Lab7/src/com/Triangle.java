package com;
import java.lang.Math;

public class Triangle extends Figure{

    private double a;

    private double b;

    private double c;

    Triangle() {
        this.c=this.b=this.a=1;
    }

    Triangle(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;

        if (!(a+b>c&&b+c>a&&a+c>b)) {
            System.out.println("ERROR: triangle cannot be built"); System.exit(0); }
    }

    @Override
    public double getArea() {
        double p= getPerimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
