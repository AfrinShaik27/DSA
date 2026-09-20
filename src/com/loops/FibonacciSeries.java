package com.loops;

import java.util.Scanner;

public class FibonacciSeries {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the N value:");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count<=n)

        {
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println(b);
    }

}



