package com.loops.assignmentp;

import java.util.Scanner;

//Area Of Circle Java Program
public class Eg1 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        double r=sc.nextDouble();
        double area=Math.round(((Math.PI)*r*r)*1000.0)/1000.0;
        System.out.println("Area of the Circle is: "+area);
    }
}
