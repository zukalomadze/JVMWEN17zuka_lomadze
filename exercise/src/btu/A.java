package btu;

import java.util.Scanner;

class A {
    int x;
    public A(){
        System.out.println("Hello");
    }

    void method1(){
        System.out.println("enter the value of x");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
    }

    int method2(){
        System.out.println(x+12);
        return x+12;
    }
    int method3(){
        if(x % 2 == 0)
        {
            System.out.println(x+" is Even ");
            return 1;
        }
        else
        {
            System.out.println(x+" is Odd ");
            return 0;
        }
    }
}

class B extends A{
    int y;

    void method1() {
        super.method1();
        System.out.println("enter value of y");
        Scanner scanner = new Scanner(System.in);
        y = scanner.nextInt();
    }

    int method2() {
        System.out.println("the sum of these numbers is");
        System.out.println(x+y);
        return x+y;
    }
}
