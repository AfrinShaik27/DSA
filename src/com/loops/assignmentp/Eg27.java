package com.loops.assignmentp;
//Factorial Program In Java
import java.util.Scanner;
public class Eg27 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value to find factorial:");
        int n = in.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.print("Factorial of a Given Number is:" +fact);

    }
}
