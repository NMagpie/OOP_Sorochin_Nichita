package com;
import java.util.ArrayList;

public class Stack {
    private ArrayList <Integer> elements = new ArrayList<>();

    Stack() {
    }

    public boolean isempty() {
        return elements.size()==0;
    }

    public void push(int n) {
         elements.add(elements.size(),n);
    }

    public void pop() {
        if (!elements.isEmpty()) elements.remove(elements.size()-1);
    }

    public void show() {
        for (int i=0;i<elements.size();i++) {
            System.out.print(elements.get(i)+" ");
        }

        System.out.println("\n");
    }

}
