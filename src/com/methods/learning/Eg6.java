package com.methods.learning;

import org.w3c.dom.ls.LSOutput;

public class Eg6 {
    int b=20;
    public static void main(String[] args) {
        int a=20;
        int bb=30;
        {
            a=10;
            bb=100;
            System.out.println(a);
            System.out.println(bb);
            int c;


        }
        bb=4547;
        System.out.println(bb);
       int c=289;
        System.out.println(c);
        funScope();
        //System.out.println(i);---->error



        int n=5;
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }

       // System.out.println(i);--'> error
    }
    static  void funScope()
    {
        int i=19;
        System.out.println(i);
    }






}
