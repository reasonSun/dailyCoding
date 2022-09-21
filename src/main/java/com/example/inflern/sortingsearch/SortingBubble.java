package com.example.inflern.sortingsearch;

public class SortingBubble {

    public static void main(String[] args) {
        SortingBubble bubble = new SortingBubble();
        for (int n : bubble.solution(6,new int[] {13, 5, 11, 7, 23, 15})) System.out.print(n + " ");
    }

    private int[] solution(int num, int[] arr) {

        for (int i = 0; i < num-1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = tmp;
                }
            }
        }

        return arr;
    }
}
