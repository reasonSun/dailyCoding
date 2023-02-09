package com.example.programmers.level2;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringMinMax {
    public static void main(String[] args) {
        StringMinMax minMax = new StringMinMax();
        String str = "-1 -2 -3 -4";
        System.out.println(minMax.solution(str));
    }

    private String solution(String str) {
        String[] arr = str.split(" ");

        int[] intArr = Stream.of(arr).mapToInt(Integer::parseInt).toArray();
        int min = Arrays.stream(intArr).min().getAsInt();
        int max = Arrays.stream(intArr).max().getAsInt();


        return min+" "+max;

    }
}
