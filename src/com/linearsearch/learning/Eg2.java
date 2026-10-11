package com.linearsearch.learning;

public class Eg2 {
    static void main(String[] args) {
        int [] nums={2,7,9,20,26,67,19,67,89,65};
        int target=67;
        boolean ans=linearSearch3(nums,target);
        System.out.println(ans);
    }
    static boolean linearSearch3(int[] nums,int target)
    {
        if(nums.length==0)
        {
            return false;
        }
        for(int element:nums)
        {
            if(element==target)
            {
                return true;
            }
        }
        return false;
    }
     static int linearSerach2(int[] arr,int target)
     {
         if(arr.length==0)
         {
             return  -1;
         }

         for(int element:arr)
         {
             if(element==target)
             {
                 return element;
             }
         }
         return -1;
     }
    static int linearSerach(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }

        for(int index=0;index<arr.length;index++)
        {
            int element=arr[index];
            if(element==target)
            {
                return index;
            }
        }
        return -1;
    }
}
