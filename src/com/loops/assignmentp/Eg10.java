package com.loops.assignmentp;
//Perimeter Of Parallelogram
import java.util.Scanner;

public class Eg10 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of first adjacent side:");
        double a=sc.nextDouble();

        System.out.print("Enter the length of second adjacent side:");
        double b=sc.nextDouble();

        double perimeter=2*(a+b);

        System.out.print("Perimeter of the parallelogram:"+perimeter);

    }
}
