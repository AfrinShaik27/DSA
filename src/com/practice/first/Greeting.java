package com.practice.first;
import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class Greeting {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name a Person:");
        String name=sc.nextLine();

        System.out.println("Hey Hi "+name+" Welcome to learn Java Programming Language");
        sc.close();

    }
}
