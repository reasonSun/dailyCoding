package com.example.inflern.sortingsearch;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] arr = {23, 87, 65, 12, 57, 32, 99, 81};
        System.out.println(search.solution(8,32,arr));
    }

    private int solution(int num, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0, rt=num-1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == m) {
                answer = mid+1;
                break;
            }
            if(arr[mid] > m) rt=mid-1;
            else lt=mid+1;
        }
        return answer;
    }
}
