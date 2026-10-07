package com.arrays.learnings;

import java.util.ArrayList;
import java.util.Scanner;

public class Eg6 {
    static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<5;i++)
        {
            System.out.print("Add list items:");
            list.add(in.nextInt());
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}
