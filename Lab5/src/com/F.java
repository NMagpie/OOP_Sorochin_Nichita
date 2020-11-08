package com;

public class F extends E{
    protected String f="f";

    public void setF(String f) {
        this.f = f;
    }

    public void printAll() {
        super.printAll(); System.out.print(" "+f); }

    F() {

    }

    F(String f,String x) {
        super.x= new X(x);
        this.f=f;
    }
}
