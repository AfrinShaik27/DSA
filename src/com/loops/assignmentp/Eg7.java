package com.loops.assignmentp;

import java.util.Scanner;

//Area Of Equilateral Triangle
public class Eg7 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the equal side length of equilateral triangle:");
        double a=sc.nextDouble();

        double area=Math.round((((Math.sqrt(3))/4)*a*a)*1000.0)/1000.0;

        System.out.println("Area of equilateral triangle:"+area);
    }
}
