package com;

public class paranth {

    public String addChar(String str, char ch, int position) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(position, ch);
        return sb.toString();
    }

    public void check(String s) {

        Stack stack= new Stack();

        boolean fullness=false,chck=false;
        char c;
        for (int i=0;i<s.length();i++) {
            c= s.charAt(i);
            switch (c) {
                case '(':
                    stack.push(c);
                    fullness = true;
                    break;
                case ')':
                    if (!stack.isempty()) stack.pop();
                    else {
                        chck=true;
                    }
                    fullness = true;
                    break;
            }
        }

        System.out.println();
        if (!fullness) {
            System.out.println("There are no parantheses.");
        } else {
            if (stack.isempty()&&!chck) System.out.println("Parantheses are put correctly.");
            else System.out.println("Parantheses are not put correctly.");
        }
        System.out.println();
    }

}