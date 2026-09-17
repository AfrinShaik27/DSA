package com.practice.first;

import java.util.Scanner;

public class Palindrome {
    static  void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String Value:");
        String str=sc.nextLine();
        String reverse="";

        for(int i=str.length()-1;i>=0;i--)
        {
            reverse=reverse + str.charAt(i);

        }
        if(str.equals(reverse))
        {
            System.out.println("Entered String is Palindrome");
        }
        else {
            System.out.println("Entered String is not a Palindrome");
        }
    }
}
