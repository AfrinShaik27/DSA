package com.binarysearch;

public class ElementInMountainArray {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=7;
        int peak=peakIndexInMountainArray(arr);
        int firstTry=orderAgnosticBS(arr,target,0,peak);
        int ans=search(arr,firstTry,target,peak);
        System.out.println(ans);

    }
    static int search(int[] nums,int firstTry,int target,int peak)
    {

        if(firstTry != -1)
        {
            return firstTry;
        }
        return orderAgnosticBS(nums,target,peak+1,nums.length-1);
    }
    static int peakIndexInMountainArray(int[] nums)
    {
        int start=0;
        int end=nums.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;

            if(nums[mid]>nums[mid+1])
            {
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int[] nums,int target,int start,int end)
    {
        boolean isAsc=nums[start]<nums[end];

        while(start<end)
        {
            int mid=start+(end-start)/2;

            if(target==nums[mid])
            {
                return  mid;
            }

            if (isAsc) {
                if(target<nums[mid])
                {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else {
                if(target>nums[mid])
                {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
