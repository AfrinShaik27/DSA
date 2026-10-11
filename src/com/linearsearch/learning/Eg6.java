package com.linearsearch.learning;

import java.util.Arrays;

public class Eg6
{
    static void main(String[] args) {
        int[][] arr= {
                {23, 4, 1},
                {18, 2, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
            };
        int target=12;
       int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));



    }
    static int[] search(int[][] nums,int target)
    {
        for (int row = 0; row < nums.length; row++)
        {
            for (int col = 0; col < nums[row].length; col++)
            {
                if (nums[row][col] == target)
                {
                    return new int[]{row, col};
                }
            }
        }
        return new int[] {-1,-1};
    }

}