package com.practice.first;
import java.util.Scanner;

//Take two numbers and print the sum of both.

public class SumOf2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the a value:");
        int a=sc.nextInt();
        System.out.print("Enter the b value:");
        int b=sc.nextInt();

        int sum=a+b;
        System.out.println("The Sum Of The a & b is: "+sum);


    }
}
