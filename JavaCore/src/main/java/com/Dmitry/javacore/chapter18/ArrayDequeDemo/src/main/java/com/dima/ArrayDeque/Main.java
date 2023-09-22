package com.dima.ArrayDeque;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> adq=new ArrayDeque<String>();
        adq.add("a");
        adq.add("b");
        adq.add("d");
        adq.add("e");
        adq.add("f");
        while(adq.peek()!=null)
            System.out.print(adq.removeLast()+" ");
    }
}