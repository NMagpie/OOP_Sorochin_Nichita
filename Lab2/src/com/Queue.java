package com;
import java.util.ArrayList;

public class Queue {
    private ArrayList <Integer> elements = new ArrayList<>();
    int size;

    public void isempty() {
        if (elements.size()==0) {
            System.out.println("The Queue is empty"); } else {
            System.out.println("The Queue is not empty");
        }
    }

    public void isfull() {
        if (this.size==-1) {
            System.out.println("The Queue will never be full"); } else if (this.size==elements.size()) {
            System.out.println("The Queue is full");
        } else {
            System.out.println("The Queue is not full"); }
    }

    public void push(int n) {
        if (size==elements.size()) { } else elements.add(0,n);
    }

    public void pop() {
        elements.remove(0);
    }

    public void show() {
        for (int i=0;i<elements.size();i++) {
            System.out.print(elements.get(i)+" ");
        }

        System.out.println("\n");
    }

    Queue() {
        ArrayList <Integer> elements = new ArrayList<>();
        this.size=-1;
    }

    Queue(int n) {
        ArrayList <Integer> elements = new ArrayList<>();
        this.size=n;
    }

}
