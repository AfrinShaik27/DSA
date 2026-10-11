package com.linearsearch.learning;

public class Eg8 {
    public static void main(String[] args) {
        int[][] arr= {
                {23, 4, 1},
                {18, 2, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        System.out.println("The Maximum Value from the array is:"+ maxVal(arr));

    }
    static int maxVal(int[][] nums)
    {
        int max=Integer.MIN_VALUE;

        for(int [] ints:nums)
        {
            for(int element:ints)
            {
                if(element>max)
                {
                    max=element;
                }
            }
        }
        return max;
    }
}
