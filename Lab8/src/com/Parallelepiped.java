package com;

public class Parallelepiped implements GeometricBody{

    private double a;

    private double b;

    private double c;

    Parallelepiped() {
        this.a= this.b=this.c=1;
    }

    Parallelepiped(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double getVolume() {
        return a*b*c;
    }

    @Override
    public double getSurface() {
        return 2*(a*b+a*c+b*c);
    }
}
