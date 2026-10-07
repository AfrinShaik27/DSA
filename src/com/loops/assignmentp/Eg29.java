package com.loops.assignmentp;

import java.util.Scanner;

//Calculate Average Of N Numbers
public class Eg29 {
  public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      System.out.print("Enter the number of N numbers:");
      int N=in.nextInt();
      int sum=0;
      for(int i=1;i<=N;i++)
      {
          System.out.print("Enter the number:");
          int n=in.nextInt();
          sum=sum+n;
      }
      double avg=(sum/N);
      System.out.print("Average of N Numbers:"+avg);
    }
}
