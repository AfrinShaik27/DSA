package com.practice.first;

import java.util.Scanner;

public class Multiplication {
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the for Multiplication:");
        int mul=sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(mul+"*"+i+"="+i*mul);
        }
    }
}
