package com.loops.assignmentp;

import java.util.Scanner;

//Calculate Electricity Bill
public class Eg28 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the no of units:");
        double units=in.nextDouble();
        double bill=0;
        if(units<=100)
        {
            bill=(units*1.5);
        }
        else if (units<=200){
            bill=(100*1.5)+(units-100)*2.50;
        }
        else if (units<=300){
            bill=(100*1.5)+(100*2.50)+(units-200)*4.0;
        }
        else{
            bill=(100*1.5)+(100*2.50)+(100*4.0)+(units-300)*6.00;
        }
        System.out.print("The Electricity Bill is:"+bill);

    }
}
