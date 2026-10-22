package com.binarysearch;

public class floorOfNumber {
    static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=7;
        int ans=toFindFloorNumber(arr,target);
        System.out.println(ans);
    }

    static int toFindFloorNumber(int[] nums,int target)
    {
        int start=0;
        int end=nums.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(target<nums[mid])
            {
                end=mid-1;
            }
            else if(target>nums[mid])
            {
                start=mid+1;
            }
            else {
                return  mid;
            }
        }
        return end;
    }
}
