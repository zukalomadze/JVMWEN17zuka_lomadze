package com.company;

public class Student {
    String name = "Nino";
    String lastName;
    double gpi;
    int age;
    String idNumber;
    Boolean status;


    void printAgeAfter50Years(){
        System.out.println(age+50);
    }


    void printData(){
        System.out.println(name);
        System.out.println(lastName);
        System.out.println(gpi+"\n"+age+"\n"+idNumber);
        System.out.println(status);
    }
}
