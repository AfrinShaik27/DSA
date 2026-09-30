package com.conditionalstatements;

import java.util.Scanner;

public class SwitchStatement {
    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Day:");
        int Day=in.nextInt();
        switch (Day)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a Valid Day");
        }
    }
}
