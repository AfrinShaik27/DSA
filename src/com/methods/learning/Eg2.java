package com.methods.learning;

import java.util.Scanner;

public class Eg2 {
    public static void main(String [] args)
    {
        String msg=greet();
        System.out.println("Afrin "+msg);
        just();
        boolean ans=evenodd();
        if(ans)
        {
            System.out.println("You Entered Number is Even :"+ans);
        }else{
                System.out.println("You Entered Number is Even :"+ans);
        }

    }

    static String greet()
    {
        String message="Hi, How are you";
        return message;
    }

    static void just()
    {
        System.out.println("I'm in just method");

    }
    static boolean evenodd()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value:");
        int n=sc.nextInt();
        return n%2==0;
    }
}
