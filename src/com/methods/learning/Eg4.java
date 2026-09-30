package com.methods.learning;

public class Eg4  {

   public static void main(String [] args)
   {
       int a=10;
       int b=20;
       swap(a,b);
       System.out.print("After swaping "+a+" "+b);

//       String name="Afrin Shaik";
//       greet(name);

       String name="kunal";
       changeNaam(name);
       System.out.println(name);

   }
   static  void changeNaam(String naam)
   {
       naam = "Rahul Rana";
   }
//   static  void greet(String naam)
//   {
//       System.out.println(naam);
//   }
   static void swap(int a,int b)
   {
       int temp=a;
       a=b;
       b=temp;

   }

}
