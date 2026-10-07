package com.arrays.learnings;

import java.util.Arrays;

public class Eg3 {
    public static void main(String [] args)
    {
        int [] arr={2,56,78,90,7};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));

    }static void change(int [] nums)
    {
        nums[0]=99;
    }
}
