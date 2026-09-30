package com.loops.assignmentp;

import java.util.Scanner;

//Volume Of Cylinder
public class Eg16 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the radius of a cylinder:");
        double r=sc.nextDouble();

        System.out.print("Enter the height of a cylinder:");
        double h=sc.nextDouble();

        double volume=Math.round(((Math.PI)*r*r*h)*1000.0)/1000.0;
        System.out.print("Volume of a Cylinder:"+volume);
    }
}
