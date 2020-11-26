package com;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Figure> Figures = new ArrayList<>();

        Figures.add(new Square(4));
        Figures.add(new Rectangle(4,6));
        Figures.add(new Triangle(2,4,5));

        Figure result = FigureController.biggestPerimeter(Figures);

        System.out.println(result.getPerimeter());

        result= FigureController.biggestArea(Figures);

        System.out.println(result.getArea());

        Figure Circle = new Figure() {

            double r=10;

            @Override
            public double getArea() {

                return Math.pow(r,2)*Math.PI;
            }

            @Override
            public double getPerimeter() {
                return 2*Math.PI*r;
            }
        };

        Figures.add(Circle);

        result = FigureController.biggestPerimeter(Figures);

        System.out.println(result.getPerimeter());

        result= FigureController.biggestArea(Figures);

        System.out.println(result.getArea());

    }
}
