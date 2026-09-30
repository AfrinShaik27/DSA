package com.loops.assignmentp;
//Volume Of Prism
import java.util.Scanner;

public class Eg15 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter area of the base of prism:");
        double b=sc.nextDouble();

        System.out.print("Enter the perpendicular height of prism:");
        double h=sc.nextDouble();

        double volume=b*h;
        System.out.print("Volume of prism:"+volume);

    }
}
