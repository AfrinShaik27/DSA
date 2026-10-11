package com.binarysearch;

public class OrderAgnasticBS {
    static void main(String[] args) {
        int[] arr={99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target=22;
        int ans=orderAgnasticbs(arr,target);
        System.out.println(ans);
    }

    static int orderAgnasticbs(int[] nums,int target)
    {
        int start=0;
        int end=nums.length-1;


        boolean isAsc=nums[start]<nums[end];

        while (start<=end)
        {
            int mid=start+(end-start)/2;

            if (nums[mid] == target) {
                return mid;
            }

            if(isAsc)
            {
                if(target<nums[mid])
                {
                    end=mid-1;
                }else {
                    start=mid+1;
                }

            }
            else {

                if(target>nums[mid])
                {
                    end=mid-1;
                }else {
                    start=mid+1;
                }

            }
        }

        return -1;
    }
}

