package com.dima.SpliteratorDemo;

import java.util.ArrayList;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> val = new ArrayList<>();
        val.add(1.0);
        val.add(2.0);
        val.add(3.0);
        val.add(4.0);
        val.add(5.0);

        System.out.println("Содержимое:\n");
        Spliterator<Double> spl = val.spliterator();
        while (spl.tryAdvance((n -> System.out.println(n)))) ;
        System.out.println();

        spl=val.spliterator();
        ArrayList<Double>sqrt=new ArrayList<>();
        while (spl.tryAdvance((n-> sqrt.add(Math.sqrt(n)))));

        System.out.println("Массив sqrt: ");
        spl=sqrt.spliterator();
        spl.forEachRemaining((n-> System.out.println(n)));

    }
}

