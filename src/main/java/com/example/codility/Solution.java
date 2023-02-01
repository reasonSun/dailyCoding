package com.example.codility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution ss = new Solution();
        int[] arr = {3, 8, 9, 7, 6};
        int k = 3;
        for(int n : ss.solution(arr, k)) System.out.print(n);
    }

    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        List<Integer> list = Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));
        Collections.rotate(list, k);
        System.out.println(list);

        return answer;
    }
}
