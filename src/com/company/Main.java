package com.company;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int a = 3;
        int w = 4;
        int b = 5;
        int X = 6;
        int e = 2;
        int res1, res2, res3, res4;
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

