package com.loops;

import java.util.Scanner;

public class Largestnumberof3
{
    static void main() {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter a value:");
        int a=in.nextInt();
        System.out.print("Enter b value:");
        int b=in.nextInt();
        System.out.print("Enter c value:");
        int c=in.nextInt();
//        int max=a;
//        if(b>max)
//        {
//            max=b;
//        }
//        if(c>max)
//        {
//            max=c;
//        }
//        System.out.println(max);

//        int max=0;
//        if(a>max)
//        {
//            max=a;
//        }
//        else {
//            max=b;
//        }
//        if(c>max)
//        {
//            max=c;
//        }
//        System.out.println(max);

        int max=Math.max(c,(Math.max(a,b)));
        System.out.println("Biggest Number Among 3 Entered number is:"+max);
    }
}
