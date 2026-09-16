package com.practice.first;
import java.util.Scanner;
//Take 2 numbers as inputs and find their HCF and LCM.
public class HcfLcm {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1 value: ");
        int num1=sc.nextInt();

        System.out.print("Enter num2 value: ");
        int num2=sc.nextInt();

        int hcf=1;
        for(int i=1;i<=Math.min(num1,num2);i++)
        {
            if((num1%i==0)&&(num2%i==0))
            {
                hcf=i;
            }
        }
        int lcm=(num1*num2)/hcf;

        System.out.println("HCF is: "+hcf);
        System.out.println("LCM is: "+lcm);
    }
}
