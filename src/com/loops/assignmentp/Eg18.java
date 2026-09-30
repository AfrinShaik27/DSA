package com.loops.assignmentp;
//Volume Of Pyramid
import java.util.Scanner;

public class Eg18 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the area of base of pyramid:");
        double b=sc.nextDouble();

        System.out.print("Enter the perpendicular height of pyramid:");
        double h=sc.nextDouble();

        double volume=(0.33)*b*h;
        System.out.print("Volume of pyramid:"+volume);

    }
}
