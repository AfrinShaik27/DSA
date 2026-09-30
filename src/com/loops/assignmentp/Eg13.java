package com.loops.assignmentp;

import java.util.Scanner;

//Perimeter Of Rhombus
public class Eg13 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the anyone of side length of a square:");
        double a=sc.nextDouble();

        double perimeter=4*a;
        System.out.print("Perimeter of a square:"+perimeter);

    }
}
