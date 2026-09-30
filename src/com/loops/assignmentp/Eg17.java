package com.loops.assignmentp;

import java.util.Scanner;

//Volume Of Sphere
public class Eg17 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the radius of a sphere:");
        double r=sc.nextDouble();

        double volume=Math.round((4.0/3)*(Math.PI)*r*r*r*1000.0)/1000.0;
        System.out.println("Volume of sphere:"+volume);
    }
}
