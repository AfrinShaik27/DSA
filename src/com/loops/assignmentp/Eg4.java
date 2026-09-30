package com.loops.assignmentp;

import java.util.Scanner;

//Area Of Isosceles Triangle
public class Eg4 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base of a isosceles triangle:");
        double b=sc.nextDouble();

        System.out.print("Enter height of a isosceles triangle:");
        double h=sc.nextDouble();

        double area=(0.5)*b*h;

        System.out.println("Area of isosceles triangle is:"+area);
    }
}
