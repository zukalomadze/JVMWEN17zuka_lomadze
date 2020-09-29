package btu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        amocana 1
//        System.out.println("C++,\nC#,\njava,\npascal,\nphp,\nJavaScript,\nActionScript\n\n\n");
//
//
////        amocana 2
        Scanner scanner = new Scanner(System.in);
//        int number1, number2;
//        System.out.println("enter first number");
//        number1 = scanner.nextInt();
//        System.out.println("enter second number");
//        number2 = scanner.nextInt();
//        System.out.println("first divided by second is " + number1/number2);
//        System.out.println("the leftover form second divided by first is " + number2%number1);
//
////        amocana 3
//        int number3, number4, number5;
//        System.out.println("enter first number");
//        number3 = scanner.nextInt();
//        System.out.println("enter second number");
//        number4 = scanner.nextInt();
//        System.out.println("enter third number");
//        number5 = scanner.nextInt();
//        System.out.format("the sum of these numbers is %d%n", (number4+number3+number5));
//        System.out.format("the multiple of these numbers is %d%n", (number4*number3*number5));
//
////        amocana 4
//        int samnishna;
//        System.out.println("Enter a 3 digit number(more than 99 less than 1000");
//        samnishna = scanner.nextInt();
//        System.out.println(samnishna%10);
//        samnishna = samnishna /10;
//        System.out.println(samnishna%10);
//        samnishna = samnishna/10;
//        System.out.println(samnishna%10);
//
//        amocana 5
//        int otxnishna, jami = 0;
//        System.out.println("Enter a 4 digit number(more than 999 less than 10000");
//        otxnishna = scanner.nextInt();
//        jami = jami + otxnishna%10;
//        otxnishna = otxnishna/10;
//        jami = jami + otxnishna%10;
//        otxnishna = otxnishna/10;
//        jami = jami + otxnishna%10;
//        otxnishna = otxnishna/10;
//        System.out.format("the sum of these digits is %d%n", (jami+ otxnishna%10));
//
//        amocana 6
        int m, n, sum = 0;
        System.out.print("Enter any number:");
        m = scanner.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("the Sum of the digits is"+sum);

//        amocana 7


    }

}
