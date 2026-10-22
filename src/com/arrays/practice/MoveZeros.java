package com.arrays.practice;

import java.util.Arrays;

public class MoveZeros {
    static void main(String[] args) {
        int[] arr={0,9,0,-3,0,5};
        int[] ans= movingZeros(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] movingZeros(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }

}
