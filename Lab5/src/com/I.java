package com;

public class I extends H {
    protected String i="i";

    public void setI(String i) {
        this.i = i;
    }

    public void printAll() {
        super.printAll(); System.out.print(" "+i); }

    I() {

    }

    I(String i,String x) {
        super.x= new X(x);
        this.i=i;
    }
}
