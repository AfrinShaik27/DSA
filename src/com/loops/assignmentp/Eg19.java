package com.loops.assignmentp;

import java.util.Scanner;

//Curved Surface Area Of Cylinder
public class Eg19 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the side length of a cube:");
        double a=sc.nextDouble();

        double lsa=4*a*a;
        System.out.print("Lateral Surface Area of a cube:"+lsa);

    }
}
