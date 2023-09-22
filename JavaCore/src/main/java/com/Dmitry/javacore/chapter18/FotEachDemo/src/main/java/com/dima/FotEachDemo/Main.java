package com.dima.FotEachDemo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> val = new ArrayList<>();
        val.add(1);
        val.add(2);
        val.add(3);
        val.add(4);
        val.add(5);

        System.out.print("исходное: ");
        for (int v : val)
            System.out.print(v + " ");
        System.out.println();
        int sum = 0;
        for (int v : val)
            sum += v;
        System.out.println("Сумма: " + sum);
    }
}