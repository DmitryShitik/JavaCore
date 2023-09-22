package com.dima.task1;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static int[] findSumIndices(int[] array, int targetSum) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int complement = targetSum - array[i];
            if (numIndexMap.containsKey(complement)) {
                return new int[]{numIndexMap.get(complement), i};
            }
            numIndexMap.put(array[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("");
        int masLen= in.nextInt();
        int[]array=new int[masLen];
        for (int i = 0; i < masLen; i++) {
            array[i]= in.nextInt();
        }
        int targetSum = in.nextInt();
        int[] result = findSumIndices(array, targetSum);
        System.out.println(Arrays.toString(result));
    }
}