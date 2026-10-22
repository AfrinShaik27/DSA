package com.arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Eg1 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][][] arr= new int[3][3][3];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<arr[j].length;k++)
                {
                    System.out.print("Enter the Array elements:");
                    arr[i][j][k]=sc.nextInt();
                }
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Array "+i+1+":");
            for(int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<arr[i][j].length;k++)
                {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
