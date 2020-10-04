package com;

public class Main {

    public static void main(String[] args) {
        // EX. 1
        Monitor Mon1= new Monitor();

        Mon1.color="White";
        Mon1.dimx=16;
        Mon1.dimy=9;
        Mon1.resx=1280;
        Mon1.resy=720;

        Monitor Mon2= new Monitor();

        Mon2.color="Black";
        Mon2.resx=1152;
        Mon2.resy=864;
        Mon2.dimx=4;
        Mon2.dimy=3;

        Monitor.MonCompare(Mon1,Mon2);

    }
}