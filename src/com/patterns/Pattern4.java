package com.patterns;

public class Pattern4 {
    static void main(String[] args) {
        pattern4(4);

    }
    static void pattern4(int n)
    {
        int originalN=n;
        n=2*n;
        for(int row=0;row<=n;row++)
        {
            for(int col=0;col<=n;col++)
            {
                int atEveryIndex=originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println( );
        }
    }
}
