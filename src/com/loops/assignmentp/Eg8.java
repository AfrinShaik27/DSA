package com.loops.assignmentp;

import java.util.Scanner;

//Perimeter Of Circle
public class Eg8 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        double r=sc.nextDouble();

        double circumference=Math.round((2*Math.PI*r)*1000.0)/1000.0;

        System.out.print("Circumference of a circle is:"+circumference);

    }
}
