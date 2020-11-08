package com;

public class J extends I{
    protected String j="j";

    public void setJ(String j) {
        this.j = j;
    }

    public void printAll() {
        super.printAll(); System.out.print(" "+j); }

    J() {

    }

    J(String j,String x) {
        super.x= new X(x);
        this.j=j;
    }
}
