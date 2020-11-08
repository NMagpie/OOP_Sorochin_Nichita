package com;

public class B extends A {
    protected String b="b";

    public void setB(String b) {
        this.b = b;
    }

    public void printAll() {
        super.printAll(); System.out.print(" "+b); }

        B() {

        }

        B(String b,String x) {
        super.x= new X(x);
        this.b=b;
        }
}
