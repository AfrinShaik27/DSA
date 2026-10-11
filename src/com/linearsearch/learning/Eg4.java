package com.linearsearch.learning;

public class Eg4 {
    static void main(String[] args) {
        int[] nums={18,12,-7,3,14,28};
        int target=3;
        System.out.println(linearSearch(nums,target,1,4));
    }
    static int linearSearch(int[] arr,int target,int start,int end)
    {
        if(arr.length==0)
        {
            return -1;
        }

        for(int index=start;index<end;index++)
        {
            if(arr[index]==target)
            {
                return index;
            }
        }

        return -1;
    }
}
