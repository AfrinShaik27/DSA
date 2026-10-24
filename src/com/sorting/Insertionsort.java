package com.sorting;

import java.util.Arrays;

public class Insertionsort {
    static void main(String[] args) {
        int[] arr={0,-8,-5736,-778,78,76,90,45};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionsort(int[] arr)
    {
        for(int i=0;i< arr.length-1;i++)
        {
           for(int j= i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
                else {
                    break;
                }
            }
        }
    }
}
