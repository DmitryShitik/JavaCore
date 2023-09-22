package com.dima.CompDemo;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String>ts=new TreeSet<>(new MyComp());
        ts.add("c");
        ts.add("a");
        ts.add("b");
        ts.add("e");
        ts.add("f");
        ts.add("d");
        for (String elem:ts)
            System.out.println(elem+" ");
        System.out.println();
    }
}