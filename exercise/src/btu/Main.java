package btu;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        davaleba 1
//        C c = new C();
//        c.method1();
//        c.method2();
//        c.method3();
//        c.method4();
//        c.method5();
//        c.method6();


//        davaleba 2
//        A a = new A();
//        a.method1();
//        a.method2();
//        a.method3();
//        B b = new B();
//        b.method1();
//        b.method2();

//        davaleba 3

        int intArray[] = getFortyNumbers();
        System.out.println("ramdom integers from between 2 numbers");
        System.out.println(Arrays.toString(intArray));
        int evensandOdds[] = countEvensAndOdds(intArray);
        System.out.println("number of evans index 0 and number of odds index 1");
        System.out.println(Arrays.toString(evensandOdds));
        int sumOfEvansAndsOdds[] = sumEvansAndOdds(intArray);
        System.out.println("sum of all evens index 0 and sum of all odds index 1");
        System.out.println(Arrays.toString(sumOfEvansAndsOdds));
        int Random5[] = getRandomFromSums(sumOfEvansAndsOdds);
        System.out.println("5 random numbers between the sums");
        System.out.println(Arrays.toString(getRandomFromSums(Random5)));


    }

    static int[] getFortyNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int first = scanner.nextInt();
        System.out.println("enter second number separated by 40");
        int second = scanner.nextInt();
        int[] intArray = new int[40];


        if(first>second)
        {
            int range = first -second +1;
            for (int i = 0; i < 40; i++) {
                intArray[i] = (int)(Math.random() * range) + second;
            }
        }
        else
        {
            int range = second -first +1;
            for (int i = 0; i < 40; i++) {
                intArray[i] = (int)(Math.random() * range) + first;
            }
        }
        return intArray;

    }

    static int[] countEvensAndOdds(int intArray[]){
        int evensAndOdds[] = new int[2];
        for (int i=0; i<intArray.length; i++){
            if(intArray[i] % 2 == 0)
            {
                evensAndOdds[0]++;
            }
            else
            {
                evensAndOdds[1]++;
            }
        }
        return evensAndOdds;
//        indexit 0 aris luwebis raodenoba indexit 1 aris kentebis raodenoba
    }

    static int[] sumEvansAndOdds(int intArray[]){
        int sumOfEvansAndOdds[] = new int[2];
//        luwebis jamis chawera masivshi
        for(int i=0; i<intArray.length; i++){
            if(intArray[i] % 2 == 0)
            {
                sumOfEvansAndOdds[0] = sumOfEvansAndOdds[0] + intArray[i];
            }
//        kentebis jamis chawera masivshi
            else {
                sumOfEvansAndOdds[1] = sumOfEvansAndOdds[1] + intArray[i];
            }
        }
        return sumOfEvansAndOdds;
    }

    static int[] getRandomFromSums(int sumOfEvansAndsOdds[]){
        int rand5[] = new int[5];
        if (sumOfEvansAndsOdds[0]>sumOfEvansAndsOdds[1]){
            int range = sumOfEvansAndsOdds[0] -sumOfEvansAndsOdds[1] +1;
            for (int i = 0; i < 5; i++) {
                rand5[i] = (int)(Math.random() * range) + sumOfEvansAndsOdds[1];
            }
        }
        else {
            int range = sumOfEvansAndsOdds[1] -sumOfEvansAndsOdds[0] +1;
            for (int i = 0; i < 5; i++) {
                rand5[i] = (int)(Math.random() * range) + sumOfEvansAndsOdds[0];
            }
        }
        return rand5;
    }

}

