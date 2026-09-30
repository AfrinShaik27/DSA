package com.loops.assignmentp;

import java.util.Scanner;

public class Eg20 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the side length of a cube:");
        double a=sc.nextDouble();

        double tsa=6*a*a;
        System.out.print("Total Surface area of a cube:"+tsa);


    }
}
