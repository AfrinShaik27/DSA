package com.loops.assignmentp;

import java.util.Scanner;
//Fibonacci Series In Java Programs
public class E21 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n value:");
        int n=sc.nextInt();
        int a=0;
        int b=1;

            for(int i=1;i<=n;i++)
            {

            System.out.print(a +" ");
            int next=a+b;
            a=b;
            b=next;
              }
//        char c='A';
//        c++;
//        System.out.println(c);

//        try {
//            throw new RuntimeException();
//        }catch(Exception e)
//        {
//            System.out.println("E");
//        }
//        double d=9/2;
//        System.out.println(d);

    }
}
