package com.conditionalstatements;

import java.util.Scanner;

public class Ifelsestatement {
    static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your Salary:");
        double salary=in.nextDouble();
        if(salary>=15000)
        {
            salary+=1000;
            System.out.println("Now Moidied Salary is:"+salary);
        }
        else{
            System.out.println("Salary is not Moified:"+salary);

        }
    }
}
