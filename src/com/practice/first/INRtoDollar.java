package com.practice.first;
import java.util.Scanner;

//Input currency in rupees and output in USD.
public class INRtoDollar {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("How much Rupees you to convert into the Dollars:");
        float rupee=sc.nextFloat();

        double dollars=((rupee)*(95.90));
        System.out.print("The Rupees In Dollar is:"+dollars);

    }
}
