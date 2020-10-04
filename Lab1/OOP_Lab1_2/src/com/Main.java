package com;

public class Main {

    public static void main(String[] args) {

        float aver=0f;

        University Uni1= new University("USL",1955);
        Uni1.Students= new Student[3];
        Uni1.Students[0]=new Student("Mark",18,8.9f);
        Uni1.Students[1]= new Student("Karl",20,7.0f);
        Uni1.Students[2]=  new Student("Jane",19,8.9f);

        University Uni2= new University("UTL",1337);
        Uni2.Students= new Student[2];
        Uni2.Students[0]=new Student("Oleg",25,6.3f);
        Uni2.Students[1]= new Student("Vlad",21,9.5f);

        University Uni3= new University("GVN",1715);
        Uni3.Students= new Student[3];
        Uni3.Students[0]=new Student("Rose",19,6.9f);
        Uni3.Students[1]=new Student("Maria",23,5.8f);
        Uni3.Students[2]= new Student("Alex",20,8.6f);

        aver=Uni1.getMediaMark();
        aver+=Uni2.getMediaMark();
        aver+=Uni3.getMediaMark();
        aver/=3;
        System.out.println(aver);

    }
}
