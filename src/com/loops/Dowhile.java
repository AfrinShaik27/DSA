package com.loops;

import java.util.Scanner;

public class Dowhile {
    static void main() {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the N value:");
        int n=in.nextInt();
        int num=1;
        do
        {
            System.out.println(num);
            num++;
        }while(n<0);
    }
}
