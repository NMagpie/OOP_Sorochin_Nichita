package com;

public class D extends C{
    protected String d="d";

    protected X x = new X("xD");

    public void setD(String d) {
        this.d = d;
    }

    public void printAll() {
        super.printAll(); x.getName(); System.out.print(" "+d); }

    D() {

    }

    D(String d,String x) {
        super.x= new X(x);
        this.d=d;
    }
}
