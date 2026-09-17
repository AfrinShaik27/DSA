package com.practice.first;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number to start for checking armstrong numbers in between them:");
        int start=sc.nextInt();
        System.out.print("Enter a Number to end for checking armstrong numbers in between them:");
        int end=sc.nextInt();



        for(int i=start;i<end;i++)
        {
            int number=i;
            int original=i;
            int sum=0;


            while(number>0)
            {
                int digit=number%10;
                sum= sum +(digit)*(digit)*(digit);
                number=number/10;
            }
            if(original==sum)
            {
                System.out.println(original);
            }

        }



    }
}
