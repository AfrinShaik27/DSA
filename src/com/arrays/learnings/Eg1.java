package com.arrays.learnings;

import java.util.Arrays;
import java.util.Scanner;

public class Eg1 {
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        //array -> array is a data structure ,used to store the collection of data
        //syntax->
        //datatype[] variable_name=new datatype[size];
        //datatype[] variable_name   -->declaration
        //new datatype[size];  -->Initialization

        int [] arr=new int[5];
//        arr[0]=2;
//        arr[1]=67;
//        arr[2]=45;
//        arr[3]=43;
//        arr[4]=78;

//        System.out.println("Enter the array elements:");
        for(int i=0;i< arr.length;i++)
        {
            System.out.println("Enter the array elements:");
            arr[i]=in.nextInt();
        }

        for (int i=0;i<arr.length;i++)
        {
            System.out.print (arr[i] +" ");

        }
        System.out.println(" ");
        for(int nums:arr)
        {
            System.out.print(nums +" ");
        }
        System.out.println();
        System.out.print(Arrays.toString(arr));



    }
}
