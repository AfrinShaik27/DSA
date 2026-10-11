package com.linearsearch.learning;

public class Eg9 {
    //find the no of numbers that have even no of digits arr={18,124,9,1764,98,1};

    static void main(String[] args) {
        int[] arr={18,124,9,1764,98,1};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums)
    {
        int count=0;
        for(int num:nums)
        {
           if(even(num))
           {
               count++;
           }
        }
        return count;
    }

    static boolean even(int num)
    {
        int numberOfDigits=digits(num);
        return numberOfDigits % 2 ==0;

    }

    static int digits(int num)
    {
        if(num<0)
        {
            num=num*-1;
        }
        if(num==0)
        {
            return 1;
        }
        int count=0;
        while (num>0)
        {
            count++;
            num=num/10;
        }
        return count;

    }
}
