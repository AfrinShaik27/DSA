package com.loops.learning;

public class Countingaquarances {
    static void main() {
        int n=13833339;
        int count=0;

        while (n>0)
        {
            int rem=n%10;
            if(rem==3)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println("No of times 3 occured is:"+count);
    }
}
