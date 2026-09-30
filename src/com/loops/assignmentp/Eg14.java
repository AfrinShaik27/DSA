package com.loops.assignmentp;

import java.util.Scanner;

//Volume Of Cone Java Program
public class Eg14 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of a cone:");
        double r=sc.nextDouble();

        System.out.print("Enter the perpendicular height of a cone:");
        double h=sc.nextDouble();

        double volume=Math.round(((0.3)*Math.PI*r*r*h)*1000.0)/1000.0;
        System.out.print("volume of cone:"+volume);
    }
}
