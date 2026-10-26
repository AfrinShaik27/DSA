package com.sorting;

import java.util.Arrays;

public class SetMismatch {
    static void main(String[] args) {
        int[] nums={2,1,4,2,6,5};
        int[] ans=setmismatch(nums);
        System.out.println(Arrays.toString(ans));

    }
    static int[] setmismatch(int[] nums)
    {
        int i=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i] != nums[correct])
            {
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else {
                i++;
            }
        }

        for(int index=0;index<nums.length;index++)
        {
            if(nums[index] != index+1)
            {
                return new int[] {nums[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }
}
