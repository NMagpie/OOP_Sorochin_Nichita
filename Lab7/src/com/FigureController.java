package com;

import java.util.ArrayList;

public class FigureController {

    public static Figure biggestArea(ArrayList<Figure> Figures) {

        Figure tmp=Figures.get(0);

        for (int i=0;i<Figures.size();i++) {
            if (Figures.get(i).getArea()>tmp.getArea()) {
                tmp= Figures.get(i);
            }
        }

        return tmp;
    }

    public static Figure biggestPerimeter(ArrayList<Figure> Figures) {

        Figure tmp=Figures.get(0);

        for (int i=0;i<Figures.size();i++) {
            if (Figures.get(i).getPerimeter()>tmp.getPerimeter()) {
                tmp= Figures.get(i);
            }
        }

        return tmp;
    }

}
