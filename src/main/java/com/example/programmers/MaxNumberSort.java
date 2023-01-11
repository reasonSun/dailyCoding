package com.example.programmers;

import java.util.Arrays;
import java.util.Comparator;

public class MaxNumberSort {
    public static void main(String[] args) {
        MaxNumberSort sort = new MaxNumberSort();
        int[] numbers = {6,10,2};
        System.out.println(sort.solution(numbers));
    }

    private String solution(int[] numbers) {
        String[] temp = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            temp[i] = String.valueOf(numbers[i]);
        }

        /*Arrays.sort(temp, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
            람다식으로 적용해봤을때
        });*/
        Arrays.sort(temp, (a,b) -> (b + a).compareTo(a+b));

        StringBuilder answer = new StringBuilder();
        for (String s : temp) {
            answer.append(s);
        }

        //{0,0,0,0}인 경우 0000을 리턴 하는게 아닌 0을 리턴
        if (answer.charAt(0) == '0') {
            answer = new StringBuilder("0");
        }

        return answer.toString();

    }
}
