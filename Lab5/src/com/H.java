package com;

public class H extends G{
    protected String h="h";

    protected X x = new X("xH");

    public void setH(String h) {
        this.h = h;
    }

    public void printAll() {
        super.printAll(); x.getName(); System.out.print(" "+h); }

    H() {

    }

    H(String h,String x) {
        super.x= new X(x);
        this.h=h;
    }
}
