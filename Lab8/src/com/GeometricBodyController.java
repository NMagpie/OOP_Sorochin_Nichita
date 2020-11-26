package com;

import java.util.ArrayList;

public class GeometricBodyController {

    public static GeometricBody biggestVolume(ArrayList<GeometricBody> GeometricBodies) {

        GeometricBody tmp=GeometricBodies.get(0);

        for (int i=0;i<GeometricBodies.size();i++) {
            if (GeometricBodies.get(i).getVolume()>tmp.getVolume()) {
                tmp= GeometricBodies.get(i);
            }
        }

        return tmp;
    }

    public static GeometricBody biggestSurface(ArrayList<GeometricBody> GeometricBodies) {

        GeometricBody tmp=GeometricBodies.get(0);

        for (int i=0;i<GeometricBodies.size();i++) {
            if (GeometricBodies.get(i).getSurface()>tmp.getSurface()) {
                tmp= GeometricBodies.get(i);
            }
        }

        return tmp;
    }

}
