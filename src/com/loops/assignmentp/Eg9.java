package com.loops.assignmentp;

import java.util.Scanner;

//Perimeter Of Equilateral Triangle
public class Eg9 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side of a equilateral triangle:");
        double a=sc.nextDouble();

        double perimeter=4*a;
        System.out.print("Perimeter of the Equilateral Triangle:"+perimeter);
    }
}
