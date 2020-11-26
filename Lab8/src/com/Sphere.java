package com;

public class Sphere implements GeometricBody{

    private double r;

    Sphere() {
        this.r=1;
    }

    Sphere(double r) {
        this.r=r;
    }

    @Override
    public double getVolume() {
        return (4/3)*Math.PI*Math.pow(r,3);
    }

    @Override
    public double getSurface() {
        return 4*Math.PI*Math.pow(r,2);
    }
}