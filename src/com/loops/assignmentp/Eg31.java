package com.loops.assignmentp;

import java.util.Scanner;

//Calculate Distance Between Two Points
public class Eg31 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the horizontal length of first point x1:");
        int x1=in.nextInt();
        System.out.print("Enter the vertical length of second point x2:");
        int x2=in.nextInt();
        System.out.print("Enter the horizontal length of second point y1:");
        int y1=in.nextInt();
        System.out.print("Enter the vertical length of second point y2:");
        int y2=in.nextInt();

        double d1=x2-x1;
        double d2=y2-y1;

        double distance=Math.sqrt(Math.pow(d1,2)+Math.pow(d2,2));
        System.out.print("The Distance between two points:"+distance);
    }
}
