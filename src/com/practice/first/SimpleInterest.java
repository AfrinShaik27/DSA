package com.practice.first;
import java.util.Scanner;

public class SimpleInterest {
   public static void main() {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the Principal:");
       float P=sc.nextFloat();
       System.out.print("Enter the Rate:");
       float R=sc.nextFloat();
       System.out.print("Enter the Time:");
       float T=sc.nextFloat();

       float simpleInterest=(P*R*T)/100;

       System.out.println("SimpleInterest of the Entered Values is "+simpleInterest);
       System.out.print("Total Amount is "+(simpleInterest+P));
       sc.close();


    }
}
