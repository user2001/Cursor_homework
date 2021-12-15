package com.company;

public class Main {
    public static void main(String[] args) {
        double x = 1;
        double y = 2;
        double a = 3;
        double w = 4;
        double b = 5;
        double X = 6;
        double e = 2;
        double res1, res2, res3, res4;
        res1 = x + y - a / 2 * (x + w);
        res2 = a * (x + x) / y - a * 3;
        res3 = a + b / x - y;
        res4 = X - e / 2 % e + 1;
        System.out.println("x+y-a/2*(x+w)=" + res1);
        System.out.println("a*(x+x)/y-a*3=" + res2);
        System.out.println("a+b/x-y=" + res3);
        System.out.println("X-e/2%e+1=" + res4);
    }
}

