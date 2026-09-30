package com.loops.learning;

import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter the Operator to perform the Operation:");
            int op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/') {
                System.out.println("Enter the num1 and num2 values:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }

                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            }
            else if (op=='x' || op=='X')
            {
                break;
            }
            else{
                System.out.println("Invalid Option");
            }
        }

    }
}





