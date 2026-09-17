package com.practice.first;
import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class ArithmeticOperator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a value:");
        int a = sc.nextInt();

        System.out.print("Enter the b value:");
        int b = sc.nextInt();

        System.out.print("Enter the operator you want to perform:");
        String operator = sc.next();

        switch (operator) {
            case "+": {
                int sum = a + b;
                System.out.println("The Sum of a and b is:" + sum);
                break;
            }
            case "-": {
                int sub = a - b;
                System.out.println("The Subtraction of a and b is:" + sub);
                break;
            }
            case "*": {
                int mul = a * b;
                System.out.println("The Multiplication of a and b is:" + mul);
                break;
            }
            case "/": {
                int div = a / b;
                System.out.println("The Division of a and b is:" + div);
                break;
            }
            default: {
                System.out.println("Entered Operator is not Found");
            }

        }

    }
}
