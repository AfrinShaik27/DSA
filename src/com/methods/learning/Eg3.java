package com.methods.learning;

public class Eg3 {
    //passing arguments;

    public static void main(String [] args)
    {

        int addition=sum(8,56);
        System.out.println(addition);

        String mesg=setName("Afrin Shaik");
        System.out.println(mesg);
    }

    static int sum(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    static String setName(String name)
    {
        String message="Hello "+name;
        return message;
    }

}
