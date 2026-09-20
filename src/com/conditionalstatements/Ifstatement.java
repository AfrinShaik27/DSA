package com.conditionalstatements;

public class Ifstatement {
    static void main(String [] args)
    {
        int salary=20000;

        if(salary >= 15000)
        {
            salary+=1000;
            System.out.println("Now Modified salary is:"+salary);
        }
    }
}
