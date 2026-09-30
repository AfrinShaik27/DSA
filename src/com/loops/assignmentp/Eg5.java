package com.loops.assignmentp;

import java.util.Scanner;

//Area Of Parallelogram
public class Eg5 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base of a parallelogram:");
        double b=sc.nextDouble();
        System.out.print("Enter the height of a parallelogram:");
        double h=sc.nextDouble();

        double area=b*h;
        System.out.print("Area of the Parallelogram is:"+area);

    }
}
