package com.dima.TreeMapDemo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<String,Double>tm=new TreeMap<String,Double>();

        tm.put("qa",321.03);
        tm.put("ws",123.01);
        tm.put("ed",234.02);
        tm.put("rf",456.04);
        tm.put("tg",567.05);

        Set<Map.Entry<String,Double>>set=tm.entrySet();
        for (Map.Entry<String,Double>me:set){
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = tm.get("qa");
        tm.put("qa",balance+120);
        System.out.println("qa: "+tm.get("qa"));
    }
}