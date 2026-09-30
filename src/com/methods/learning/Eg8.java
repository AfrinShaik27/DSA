package com.methods.learning;

import java.util.Arrays;

public class Eg8 {

    static void main(String[] args) {
        fun(1,23,4,55,6647,231,2,1,787);
        multi(2,556,"afrin","gdfdf","anasar");

        double a=(Math.sqrt(3)/4)*6*6;
        System.out.println(a);


    }
    static void fun(int ...V)
    {
        System.out.println(Arrays.toString(V));
    }

    static void multi(int a,int b,String ...VV)
    {
        System.out.println(Arrays.toString(VV));
    }

}
