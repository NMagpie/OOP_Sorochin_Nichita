package com;

public class C extends B {
    protected String c="c";

    public void setC(String c) {
        this.c = c;
    }

    public void printAll() {
        super.printAll(); System.out.print(" "+c); }

    C() {

    }

    C(String c,String x) {
        super.x= new X(x);
        this.c=c;
    }
}
