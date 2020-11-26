package com;

public class Cube implements GeometricBody{

    private double a;

    Cube() {
        this.a=1;
    }

    Cube(double a) {
        this.a=a;
    }

    @Override
    public double getVolume() {
        return Math.pow(a,3);
    }

    @Override
    public double getSurface() {
        return 6*Math.pow(a,2);
    }
}