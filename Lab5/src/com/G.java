package com;

public class G extends  F{
    protected String g="g";

    public void setG(String g) {
        this.g = g;
    }

    public void printAll() {
        super.printAll(); System.out.print(" "+g); }

    G() {

    }

    G(String g,String x) {
        super.x= new X(x);
        this.g=g;
    }
}
