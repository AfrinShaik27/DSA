package com.linearsearch.learning;

public class Eg7 {
    static void main(String[] args) {
        int[][] arr= {
                {23, 4, 1},
                {18, 2, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        System.out.println("The Minimum Value in the 2D array is:"+minVal(arr));
    }
    static int minVal(int[][]nums)
    {
        int min=Integer.MAX_VALUE;

        for(int[] ints:nums)
        {
            for(int element:ints)
            {
                if(element<min)
                {
                    min=element;
                }
            }
        }
        return min;
    }
}
