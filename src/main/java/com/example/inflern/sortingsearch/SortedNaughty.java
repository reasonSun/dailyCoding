package com.example.inflern.sortingsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedNaughty {

    public static void main(String[] args) {
        SortedNaughty naughty = new SortedNaughty();
        System.out.println(naughty.solution(9, new int[] {120, 125, 152, 130, 135, 135, 143, 127, 160}));
    }

    private List<Integer> solution(int num, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < num; i++) {
            if(arr[i] != tmp[i]) answer.add(i + 1);
        }

        return answer;
    }
}
