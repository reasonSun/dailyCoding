package com.example.inflern.sortingsearch;

public class SortingInsert {

    public static void main(String[] args) {
        SortingInsert insert = new SortingInsert();
        for (int n : insert.solution(6,new int[] {13, 5, 11, 7, 23, 15})) System.out.print(n + " ");
    }

    private int[] solution(int num, int[] arr) {

        for (int i = 1; i < num; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (tmp < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
        return arr;
    }
}
