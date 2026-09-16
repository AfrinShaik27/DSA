package com.practice.first;
import java.util.Scanner;

//Input a year and find whether it is a leap year or not.

public class LeapYear {
    public static void main(String argss[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year:");
        int year=sc.nextInt();
        if((((year % 4 == 0)) && (!(year % 100 == 0)) )||((year%400==0)))
        {
            System.out.println("Enter year is a Leap year");
        }
        else {
            System.out.println("Enter year is not a Leap year");
        }

        sc.close();


    }
}
