package com.loops.assignmentp;

import java.util.Scanner;

//Calculate Discount Of Product
public class Eg30 {
    static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter th price of the product:");
        int price=in.nextInt();
        double discount=0;
        if(price>=5000)
        {
            discount=0.20;
        }
        else if (price>=3000) {
            discount=0.15;
        }
        else if (price>=1000) {
            discount=0.10;
        }
        else {
            discount=0;
        }
        double discountprice=price*discount;
        double finalprice=price-discountprice;
        System.out.println("Discountprice:"+discountprice);
        System.out.print("FinalPrice=:"+finalprice);
    }
}
