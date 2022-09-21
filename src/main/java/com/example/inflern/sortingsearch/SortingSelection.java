package com.example.inflern.sortingsearch;

public class SortingSelection {

    public static void main(String[] args) {
        SortingSelection selection = new SortingSelection();
        for (int n : selection.solution(6,new int[] {13, 5, 11, 7, 23, 15})) System.out.print(n + " ");
    }

    private int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }
}
