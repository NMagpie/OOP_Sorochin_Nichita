package com;

public class E extends D{
    protected String e="e";

    public void setE(String e) {
        this.e = e;
    }

    public void printAll() {
        super.printAll(); System.out.print(" "+e); }

    E() {

    }

    E(String e,String x) {
        super.x= new X(x);
        this.e=e;
    }
}
