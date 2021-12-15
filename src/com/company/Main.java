package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x= scan.nextInt();
        int y= scan.nextInt();
        int a= scan.nextInt();
        int w= scan.nextInt();
        int b= scan.nextInt();
        int X= scan.nextInt();
        int e= scan.nextInt();
        int res1,res2,res3,res4;
        res1=x+y-a/2*(x+w);
        res2=a*(x+x)/y-a*3;
        res3=a+b/x-y;
        res4=X-e/2%e+1;
        System.out.println("x+y-a/2*(x+w)="+res1);
        System.out.println("a*(x+x)/y-a*3="+res2);
        System.out.println("a+b/x-y="+res3);
        System.out.println("X-e/2%e+1="+res4);

    }
}
