package com.practice.first;

import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
public class FibonacciSeries {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to perform fibonacciSeries:");
        int n=sc.nextInt();
        int first=0;
        int second=1;
        for(int i=1;i<n;i++)
        {

              System.out.print(first);
              int next=first+second;
              first=second;
              second=next;

        }
    }
}
