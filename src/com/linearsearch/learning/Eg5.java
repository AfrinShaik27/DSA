package com.linearsearch.learning;

public class Eg5 {
    static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        int min=minValue(arr);
        System.out.println(min);
    }
    static int minValue(int[] nums)
    {
        //assume arr.length!=0;
        //return the minimum value in the array;
        int ans=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<ans)
            {
              ans=nums[i];
            }
        }
        return ans;
    }
}
