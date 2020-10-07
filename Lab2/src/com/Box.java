package com;

public class Box {
    int height;
    int width;
    int depth;

    public int surface() {
        int a=(2*height*width)+(2*width*depth)+(2*height*depth);
        return a;
    }

    public int volume() {
        int a=height*width*depth;
        return a;
    }

    public Box() {
    height=1;
    width=1;
    depth=1;
    }
    public Box(int n) {
    height=n;
    width=n;
    depth=n;
    }
    public Box(int h,int w,int d){
        height=h;
        width=w;
        depth=d;
    }
}
