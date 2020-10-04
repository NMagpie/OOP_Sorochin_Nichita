package com;

class Monitor {
    String color;
    int dimx;
    int dimy;
    int resx;
    int resy;

    public static void MonCompare(Monitor Mon1,Monitor Mon2) {
        System.out.printf("First monitor:%s\tSecond monitor:%s\n",Mon1.color,Mon2.color);
        System.out.printf("R: %d:%d\t\t\t\t%d:%d\n",Mon1.dimx,Mon1.dimy,Mon2.dimx,Mon2.dimy);
        if (Mon1.resx* Mon1.resy > Mon2.resx*Mon1.resy) { System.out.println("The resolution of the first monitor is bigger."); }
        else if (Mon1.resx* Mon1.resy == Mon2.resx*Mon1.resy) { System.out.println("The resolution of the second monitor is bigger."); }
    }
}