package com.loops.assignmentp;
//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;

public class Eg25 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        int largest=0;
        while (n != 0) {
            if (n>largest) {
               largest=n;
            }
            System.out.print("Enter the next n value:");
            n = sc.nextInt();
        }
        System.out.print("The largest number among entered numbers:"+largest);
    }
}
