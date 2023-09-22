package com.dima.LinkedListDemo;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("f");
        ll.add("b");
        ll.add("d");
        ll.add("e");
        ll.add("c");
        ll.addLast("z");
        ll.addFirst("a");
        ll.add(1, "a2");
        System.out.println("Содержимое: " + ll);
        ll.remove("f");
        ll.remove(2);
        System.out.println("После удаления: " + ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("После удаления первого и последнего" + ll);
        String val = ll.get(2);
        ll.set(2, val + " изменено");
        System.out.println("После изменения: " + ll);
    }
}