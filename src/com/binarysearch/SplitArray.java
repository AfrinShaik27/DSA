package com.binarysearch;

public class SplitArray {
    static void main(String[] args) {
        int[] arr={7,2,5,10,8};
        int m=2;
        int ans=splitArray(arr,m);
        System.out.println(ans);
    }
        static int splitArray(int[] nums, int k) {

            int start=0;
            int end=0;

            for(int num:nums)
            {
                start=Math.max(start,num);
                end=end+num;
            }

            //binary search

            while(start<end)
            {
                int mid=start+(end-start)/2;

                int pieces=1;
                int sum=0;

                for(int num:nums)
                {
                    if(sum+num>mid)
                    {
                        sum=num;
                         pieces++;
                    }
                    else{
                        sum+=num;
                    }
                }

                if(pieces>k)
                {
                    start=mid+1;
                }
                else
                {
                    end=mid;
                }
            }

            return end;



        }

}
