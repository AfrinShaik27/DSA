package com.linearsearch.learning;

public class Eg10 {
    //leet code problem to find the richest wealth of the person using their bank accounts;
    //arr=  {
//            {1,2,3} =>6
//            {4,1,6} =>11
//            {3,3,7} =>13
//           };

    // array name=accounts;
    //row=person;
    //col=account;

    static void main(String[] args) {
       int[][] arr=  {
                        {1,2,3},
                        {4,1,6},
                        {3,3,7}
                     };
        System.out.println(maximumWealth(arr));

    }
    static int maximumWealth(int[][] accounts)
    {
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++)
        {
            int sum=0;
            for(int account=0;account<accounts[person].length;account++)
            {
                sum+=accounts[person][account];
            }
            if(sum>ans)
            {
                ans=sum;
            }
        }

        return ans;

    }
}