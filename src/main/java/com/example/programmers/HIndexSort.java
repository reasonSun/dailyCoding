package com.example.programmers;

import java.util.Arrays;
import java.util.Collections;

public class HIndexSort {
    public static void main(String[] args) {
        HIndexSort sort = new HIndexSort();
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(sort.solution(citations));
    }

    private int solution(int[] citations) {
        Integer[] temp = Arrays.stream(citations)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(temp, Collections.reverseOrder());
        int answer = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] >= i+1) {
                answer = Math.max(answer, i+1);
            }
        }
        return answer;

    }
}
