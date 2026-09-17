package com.practice.first;
import java.util.Scanner;
//Write a program to print whether a number is even or odd, also take input from the user.

public class EvenOdd {
   public static void main() {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a value:");
       int a =sc.nextInt();

       if(a%2==0)
       {
           System.out.println("Enter Number is Even");
       }
       else {
           System.out.println("Enter Number is Odd");
       }
       sc.close();

    }

}
