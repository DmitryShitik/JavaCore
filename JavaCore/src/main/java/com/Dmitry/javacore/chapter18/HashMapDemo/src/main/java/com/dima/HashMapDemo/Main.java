package com.dima.HashMapDemo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double>hm=new HashMap<String,Double>();

        hm.put("qa",321.201);
        hm.put("ws",66.3);
        hm.put("ed",123.00);
        hm.put("rf",-99.2);
        hm.put("tg",0.445);

        Set<Map.Entry<String,Double>> set=hm.entrySet();

        for(Map.Entry<String, Double>me:set){
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hm.get("qa");
        hm.put("qa",balance+1000);
        System.out.println("новое значение qa: "+hm.get("qa"));
    }
}