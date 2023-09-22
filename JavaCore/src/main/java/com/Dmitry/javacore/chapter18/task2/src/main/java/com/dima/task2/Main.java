package com.dima.task2;

import java.util.*;

public class Main {
    public static void contDuplicate(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();
        int counters = 1;
        int numbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (uniqueSet.contains(array[i])) {
                counters++;
                numbers = array[i];
            }
            uniqueSet.add(array[i]);
        }
        System.out.println(counters > 0 ? (
                true + "\nЧисло " + numbers + " повторяемся " + counters + " раз") : ("Нет дубликатов")
        );
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Размер массива?");
        int massLen = in.nextInt();
        int[] array = new int[massLen];
        for (int i = 0; i < massLen; i++) {
            array[i] = in.nextInt();
        }
        contDuplicate(array);
    }
}
