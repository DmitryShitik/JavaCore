package com.dima.IteratorDemo;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("c");
        al.add("a");
        al.add("e");
        al.add("b");
        al.add("d");
        al.add("f");

        System.out.println("содержимое: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String elem = itr.next();
            System.out.print(elem + " ");
        }
        System.out.println();

        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            String elem = litr.next();
            litr.set(elem + "+");
        }

        System.out.println("измененное содержимое: ");
        itr=al.iterator();
        while (itr.hasNext()){
            String elem=itr.next();
            System.out.print(elem+" ");
        }

        System.out.println();

        System.out.println("В обратном порядке: ");
        while (litr.hasPrevious()){
            String elem= litr.previous();
            System.out.print(elem+" ");
        }
        System.out.println();
    }
}