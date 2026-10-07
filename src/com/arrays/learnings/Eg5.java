package com.arrays.learnings;

import java.util.ArrayList;

public class Eg5 {
    static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(28);
        list.add(88);
        list.add(657);
        list.add(87);
        list.add(28);
        list.add(18);
        list.add(89);
        list.add(100);
        list.add(28);
        System.out.println(list);
        System.out.println(list.contains(28));
        list.add(0,75);
        System.out.println(list);
        list.set(5,788);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);



    }
}
