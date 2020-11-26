package com;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<GeometricBody> Figures = new ArrayList<>();

        Figures.add(new Cube(4));
        Figures.add(new Parallelepiped(4,6,9));
        Figures.add(new Sphere(2));

        GeometricBody result = GeometricBodyController.biggestSurface(Figures);

        System.out.println(result.getSurface());

        result= GeometricBodyController.biggestVolume(Figures);

        System.out.println(result.getVolume());

    }
}