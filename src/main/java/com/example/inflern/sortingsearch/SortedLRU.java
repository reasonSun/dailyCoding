package com.example.inflern.sortingsearch;

public class SortedLRU {

    public static void main(String[] args) {
        SortedLRU sortedLRU = new SortedLRU();
        for (int n : sortedLRU.solution(5,9,new int[] {1,2,3,2,6,2,3,5,7})) System.out.print(n + " ");
    }

    private int[] solution(int size, int num, int[] arr) {
        int[] cache = new int[size];

        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < size; i++) if (x == cache[i]) pos = i;
            if (pos == -1) {
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }

        return cache;
    }
}
