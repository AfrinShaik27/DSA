package com.binarysearch;

public class SearchInRotatedArray {
    static void main(String[] args) {
         int[] arr={3,4,5,6,7,0,1,2};
         int target=67;
         int ans=search(arr,target);
        System.out.println(ans);

    }
    static  int search(int[] nums,int target)
    {
        int pivot=findPivot(nums);

        if(pivot==-1)
        {
            return binarySerach(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target)
        {
            return pivot;
        }
        if(target>nums[0])
        {
            return binarySerach(nums,target,0,pivot-1);
        }
        return binarySerach(nums,target,pivot+1,nums.length-1);
    }



    static int findPivot(int[] nums)
    {
        int start=0;
        int end=nums.length-1;

        while(start<end)
        {
            int mid=start+(end-start)/2;

            if(mid<end && nums[mid]>nums[mid+1])
            {
                end=mid;
            }
            if(mid>start && nums[mid]<nums[mid-1])
            {
                start=mid+1;
            }
            if(nums[mid]<=nums[start])
            {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }

    static int binarySerach(int[] nums,int target,int start,int end)
    {
        while (start<end)
        {
            int mid=start+(end-start)/2;

            if(target<nums[mid])
            {
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
