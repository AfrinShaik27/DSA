package com.practice.first;

import java.util.Scanner;

public class ArmStrongOrNot {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check armstrong or not:");
        int arm=sc.nextInt();


        int original = arm;
        int sum=0;
        while (arm>0)
        {

            int digit= arm%10;
            sum=sum+(digit)*(digit)*(digit);
            arm=arm/10;

        }
        if(original==sum)
        {
           System.out.println("Entered number is a armstrong");
        }
        else {
            System.out.println("Entered number is not a armstrong");
        }

    }
}
