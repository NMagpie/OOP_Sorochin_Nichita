package com;

import java.util.ArrayList;

public class Patient extends Person {
    String accepted;
    String sickness;
    String prescriptions;
    String allergies;
    String specialReqs;

    ArrayList<Operations_Staff> operations_staff= new ArrayList<>();

}
