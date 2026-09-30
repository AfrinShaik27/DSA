package com.loops.assignmentp;

import java.util.Scanner;

//Area Of Rhombus
public class Eg6 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first diagonal d1 of rhombus:");
        double d1=sc.nextDouble();

        System.out.print("Enter the second diagonal d2 of rhombus:");
        double d2=sc.nextDouble();

        double area=(0.5)*d1*d2;
        System.out.print("Area of a rhombus:"+area);

    }
}
