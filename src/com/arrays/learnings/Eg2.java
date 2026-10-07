package com.arrays.learnings;

import java.util.Arrays;
import java.util.Scanner;

public class Eg2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String [] str=new String[5];
        System.out.println("Enter the values:");
        for(int i=0;i<str.length;i++)
        {
            str[i]=in.next();
        }
        for (int i=0;i< str.length;i++)
        {
            System.out.print(str[i]+" ");
        }
        System.out.println();
        str[0]="kunal";
        System.out.println(Arrays.toString(str));




    }
}
