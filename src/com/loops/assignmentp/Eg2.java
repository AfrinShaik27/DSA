package com.loops.assignmentp;

import java.util.Scanner;

//Area Of Triangle
public class Eg2 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base of the triangle:");
        double b=sc.nextDouble();
        System.out.print("Enter height of the triangle:");
        double h=sc.nextDouble();

        double area=(0.5)*b*h;

        System.out.println("Area of the triangle is:"+area);
    }
}
