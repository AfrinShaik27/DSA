package com.arrays.learnings;

import java.util.Arrays;
import java.util.Scanner;

public class Eg4 {
    public static void main(String [] args)
    {
        int [][] arr=new int[3][3];
        Scanner in=new Scanner(System.in);
        System.out.println(arr.length);
        for(int row=0; row < arr.length;row++)
        {
            for(int col=0;col <arr[row].length;col++)
            {
                System.out.print("Enter array values:");
                arr[row][col]=in.nextInt();
            }
        }
//        for(int row=0;row< arr.length;row++)
//        {
//           for(int col=0;col<arr[row].length;col++)
//           {
//               System.out.print(arr[row][col]+" ");
//           }
//            System.out.println("");
//        }
        for(int row=0;row< arr.length;row++)
        {
            System.out.println(Arrays.toString(arr[row]));
        }

        for(int[] a:arr)
        {
            System.out.println(Arrays.toString(a));
        }
    }
}
