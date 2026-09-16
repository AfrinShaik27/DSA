package com.practice.first;

import java.util.Scanner;

public class Printing {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true)
        {
            System.out.print("Enter the some thing: ");
            String input=sc.nextLine();

            if(input.equals("x"))
            {
                break;
            }
            int number=Integer.parseInt(input);
            sum=sum+number;


        }
        System.out.print("Sum is: "+sum);
    }
}
