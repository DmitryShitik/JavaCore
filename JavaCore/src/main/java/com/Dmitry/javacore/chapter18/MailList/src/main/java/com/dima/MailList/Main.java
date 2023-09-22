package com.dima.MailList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Address>ml=new LinkedList<>();
        ml.add(new Address("West","11 Oak Ave","Urbane","IL","61801"));
        ml.add(new Address("Baker","1142 Maple Lane","Mahomet","IL","61853"));
        ml.add(new Address("Carlton","867 Elm St","Champaign","IL","61820"));

        for(Address elem:ml)
            System.out.println(elem+"\n");
        System.out.println();
    }
}