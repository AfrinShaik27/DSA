package com.string;

public class Eg2 {
    //String comparision
    static void main(String[] args) {
        //using this string objects are inside a string pool
        String name="Afrin";
        String myName="Afrin";
        System.out.println(name==myName);

        // using new keywords objects are created in side a heap memory
        String a= new String ("Afrin");
        String b= new String ("Afrin Shaik");
        System.out.println(a==b);

        System.out.println(name==a);


        //if you wnat to compare the values inside a string

        System.out.println(a.equals(b));
    }
}
