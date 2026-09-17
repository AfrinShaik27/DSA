package com.practice.first;
import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class GreatestNumber {
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Num1 Value:");
        int num1=sc.nextInt();
        System.out.print("Enter the Num2 Value:");
        int num2=sc.nextInt();

        if(num1>num2)
        {
            System.out.println("Num1 value "+num1+" is Greatest");
        }
        else {
            System.out.println("Num2 value "+num2+" is Greatest");
        }
        sc.close();

    }
}
