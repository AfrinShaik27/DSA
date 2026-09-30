package com.loops.assignmentp;
//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.Scanner;

public class Eg24 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        int sum=0;
            while (n != 0) {
                sum = sum + n;
                System.out.print("Enter the next n value:");
                n=sc.nextInt();
            }
       System.out.print("Sum is:"+sum);



    }
}
