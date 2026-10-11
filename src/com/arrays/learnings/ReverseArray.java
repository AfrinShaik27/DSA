package com.arrays.learnings;

import java.util.Arrays;

public class ReverseArray {
    static void main(String[] args) {
        int[] arr={16,24,38,47,78,98,89,68,91 };
//        swap(arr,0,8);
          reverse(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  void reverse(int [] arr)
    {
        int start=0;
        int end= arr.length-1;

        while (start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
//    static  void swap(int arr[],int index1,int index2)
//    {
//        int temp=arr[index1];
//        arr[index1]=arr[index2];
//        arr[index2]=temp;
//    }
}
