package com.loops.assignmentp;

import java.util.Scanner;

//Area Of Rectangle Program
public class Eg3 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of a reactangle:");
        double l=sc.nextDouble();
        System.out.print("Enter width of a reactangle:");
        double w=sc.nextDouble();

        double area=l*w;
        System.out.println("Area of reactangle is:"+area);
    }

}
