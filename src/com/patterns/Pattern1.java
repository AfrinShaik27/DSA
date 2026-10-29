package com.patterns;

public class Pattern1 {
    static void main(String[] args) {
        patten1(4);

    }
    static void patten1(int n)
    {
        for(int row=0; row<=n;row++)
        {
            for(int col=0;col<=n;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
