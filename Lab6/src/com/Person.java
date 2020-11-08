package com;

import java.util.ArrayList;

public class Person {
    String title;
    String givenName;
    String middleName;
    String familyName;
    String birthDate;
    String homeAddress;
    String phone;
    Gender gender;

    ArrayList<Hospital> hospitals= new ArrayList<>();

}

enum Gender {

    F,
    M

}