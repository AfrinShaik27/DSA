package com.linearsearch.learning;

public class Eg1 {
   public static void main(String[] args) {
       int [] nums={2,7,9,20,26,67,19,67,89,65};
       int target=67;
       boolean ans=linearSearch3(nums,target);
       System.out.print("The element is searched and found is:"+ans);

    }

    static boolean linearSearch3(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return false;
        }
        for(int a:arr)
        {
            if(a==target)
            {
                return true;
            }
        }
        return false;
    }
    static int linearSearch2(int [] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }

        for(int a:arr)
        {
            if(a==target)
            {
                return  a;
            }
        }

        return -1;
    }
    static int linearSearch(int [] arr,int target)
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

        return  -1;
    }

}
