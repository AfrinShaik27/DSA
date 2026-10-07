package com.loops.assignmentp;
import java.util.Scanner;

//Subtract the Product and Sum of Digits of an Integer
public class Eg22 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an Integer n Value:");
        int n=sc.nextInt();
        int product=1;
        int sum=0;
        while (n>0)
        {
            int rem=n%10;
            product=product*rem;
            sum=sum+rem;
            n=n/10;

        }
        int ans=product-sum;
        System.out.println(ans);
    }
}
