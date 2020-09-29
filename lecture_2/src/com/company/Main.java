package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Java Calculator V1.2");
        int number1, number2;
        String symbol;
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        symbol = scanner.next();
        switch (symbol){
            case "+":
                System.out.println(number1+number2);
                break;
            case "-":
                System.out.println(number1-number2);
                break;
            case "*":
                System.out.println(number1*number2);
                break;
            case "/":
                System.out.println(number1/number2);
                break;
            default:
                System.out.println("Not valid");
        }

    }
}
