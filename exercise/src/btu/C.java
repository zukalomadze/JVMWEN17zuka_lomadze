package btu;


import java.util.Scanner;

class C {
    int a,b,c;

//    public C() {
////        amocana 1
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
////        amocana 2
//        int method2_return = method2(a);
//
////        amocana 3
//        int method3_return = method3(b);
//
////        amocana 4
//        int method4_return = method4(c);
//
////        amocana 5
//        int method5_retun = method5(method2_return, method3_return);
//
////        amocana 6
//        method6(method3_return,method5_retun);
//    }

    void method1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 whole numbers");
        this.a = scanner.nextInt();
        this.b = scanner.nextInt();
        this.c = scanner.nextInt();
    }


    int method2() {
        int bolo_cifri = a%10;
        return bolo_cifri;
    }

    int method3() {
        int b_pirveli = b;
        while (b_pirveli >= 10){
            b_pirveli = b_pirveli/10;
        }
        return b_pirveli;
//        tu b 10ze naklebia daabrunebs b_s mnishvnelobas
//        sxva shemtxvevashi gakofs 10ze sanam ar miigebs pirvel cifrs
    }

    int method4() {
        int cifrta_jami = 0, c_shemcvleli = c;
        while (c_shemcvleli>0){
            cifrta_jami = cifrta_jami + c_shemcvleli%10;
            c_shemcvleli = c_shemcvleli/10;
        }
        return cifrta_jami;
    }

    int method5() {
        int met2 = method2();
        int met3 = method3();
        System.out.println(met2*met3);
        return met2*met3;
    }

    void method6(){
        int met3 = method3();
        int met5 = method5();
        System.out.println(met3+met5);
    }
}
