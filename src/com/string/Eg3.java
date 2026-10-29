package com.string;

import java.util.Arrays;

public class Eg3 {
    static void main(String[] args) {
        String name=" Afrin Shaik";
        System.out.println(90+name);//90Afrin Shaik
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(8));
        System.out.println(Arrays.toString(new int[] {2,34,556,656,7,786}));

        // System.out.println(new int[] {2,34,556,656,7,786}+new int[] {2,34,556,656,7,786});//Error
        // we cant add the same objects except primitives.
        //atleast one must be String.

        System.out.println('a'+'z'); //gives ascii values
        System.out.println("afrin"+'a');//afrina
        System.out.println('a'+56);
        System.out.println((char)('a'+3));

        String series=" ";
        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
            System.out.print(ch);
        }
        System.out.println();
        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
            series=series+ch;
        }
        System.out.println(series);
    }

}
