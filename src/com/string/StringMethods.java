package com.string;

import java.util.Arrays;
import java.util.Locale;

public class StringMethods {
    static void main(String[] args) {
        String name="  AfrinShaik   ";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(5));
        System.out.println(name.indexOf('n'));
        System.out.println(name.replace('n','N'));
        System.out.println(name.strip());
        String myName="Afrin Shaik Hello Worls";
        System.out.println(Arrays.toString(myName.split(" ")));

    }
}
