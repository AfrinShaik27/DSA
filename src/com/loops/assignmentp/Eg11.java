package com.loops.assignmentp;

import java.util.Scanner;
//Perimeter Of Rectangle
public class Eg11 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the length of a rectangle:");
        double l=sc.nextDouble();
        System.out.print("Enter the width of a rectangle:");
        double w=sc.nextDouble();

        double perimeter=2*(l+w);
        System.out.print("Perimeter of a rectangle:"+perimeter);
    }
}
