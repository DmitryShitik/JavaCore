package com.dima.ArrayListDemo;

import javax.crypto.spec.PSource;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        System.out.println("Начальный размер: "+ al.size());
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1,"A2");
        System.out.println("После ввода: "+al.size());

        System.out.println("Содержимое: "+al);
        al.remove("F");
        al.remove(2);
        System.out.println("После удаления: "+al.size());
        System.out.println("Содержимое"+al);

    }
}