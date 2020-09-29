package com.company;

public class Main {

    final String version = "1.0";

    public static void main(String[] args) {
//	 write your code here
//        test1 t1 = new test1();
//        System.out.println(t1.cName);
//        Student student1 = new Student();
//        System.out.println(student1);
//        student1.printAgeAfter50Years();
//        student1.printData();
//        Person p1 = new Person();
//        Person p2 = new Person(1.9);
//        System.out.println("=========");
//        Teacher t1 = new Teacher();
//        t1.printId();


    }
}
// ar kavs memkvidre
final class test3{
    public test3(){
        System.out.println("class test 3");
    }
}
// ver vqmnit obieqts
abstract class test4{
    public test4(){
        System.out.println("I am a pearson");
    }
}

class Person {
    String idNumber = "121362346";
    public Person(){
        System.out.println("I am person");
    }

    public Person(double height){
        System.out.println("My height is "+height);
    }

    public void printId(){
        System.out.println(idNumber);
    }
}

class Teacher extends Person{
    public Teacher(){
        System.out.println("I am teacher");
    }
}


class test1{
    String cName = "Test 1";

    public test1(){
        System.out.println("I am test1 Class");
    }
}