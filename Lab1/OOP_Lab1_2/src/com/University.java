package com;

public class University {
    String name;
    int foundationYear;
    Student Students[];

    University(String n,int f) {
        name =n;
        foundationYear= f;
    }

    public float getMediaMark() {
    float average=0;
        for (int i=0;i<this.Students.length; i++) {
            average+=this.Students[i].mark;
        }

        average/=this.Students.length;

        return average;
    }

}
