package com;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fIS= new FileInputStream("three_expressions.txt");
        BufferedInputStream bIS = new BufferedInputStream(fIS);
        paranth p= new paranth();
        String s="";
        int i;

        while ((i = bIS.read()) != -1) {
            if (i=='\n') {System.out.print(s); p.check(s); s="";}
            else s=p.addChar(s,(char)i,s.length());
        }
        System.out.print(s);
        p.check(s);

        fIS.close();

    }
}
