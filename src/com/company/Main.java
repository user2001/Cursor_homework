package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("x=");
        int x = scan.nextInt();
        System.out.println("y=");
        int y = scan.nextInt();
        System.out.println("a=");
        int a = scan.nextInt();
        System.out.println("w=");
        int w = scan.nextInt();
        System.out.println("b=");
        int b = scan.nextInt();
        System.out.println("X=");
        int X = scan.nextInt();
        System.out.println("e=");
        int e = scan.nextInt();
        int res1, res2, res3, res4;
        res1 = x + y - a / 2 * (x + w);
        res2 = a * (x + x) / y - a * 3;
        res3 = a + b / x - y;
        if (e != 0) {
            res4 = X - e / 2 % e + 1;
        } else throw new ArithmeticException();
        System.out.println("x+y-a/2*(x+w)=" + res1);
        System.out.println("a*(x+x)/y-a*3=" + res2);
        System.out.println("a+b/x-y=" + res3);
        System.out.println("X-e/2%e+1=" + res4);
    }

}

