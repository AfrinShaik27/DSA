package com.methods.learning;

import java.util.Arrays;

public class Eg5 {
    public static void main(String[] args) {

        int [] arr={1,2,45,67,98};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int [] nums)
    {
        nums[0]=99;
    }
}
