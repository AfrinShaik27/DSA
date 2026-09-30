package com.methods.learning;

import java.util.Scanner;

public class Eg1 {
    public static void main(String args[])
    {
       int ans= sum();
        System.out.println("Sum is:"+ans);
//          oddoreven();
    }
    static int sum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num1 Value:");
        int num1=sc.nextInt();
        System.out.print("Enter the num2 Value:");
        int num2=sc.nextInt();

        int sum=num1+num2;
//        System.out.print("The sum: "+sum);
        return sum;
    }
    static  void oddoreven()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value:");
        int n=sc.nextInt();

        if(n%2==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
