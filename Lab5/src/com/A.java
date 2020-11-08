package com;

public class A{
    protected String a="a";

    protected X x=new X("xxx");

    public void setA(String a) {
        this.a = a;
    }

    public void printAll() {
            x.getName();

        System.out.print(" "+a);
    }

    A() {
    }

    A(String a, String x) {
        this.a=a;
        this.x= new X(x);
    }
}
