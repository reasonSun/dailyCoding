package com.example.inflern.string;

public class StringIndex {

    private String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;

        String[] strArr = str.split(" ");
        for (String s : strArr) {
            int len = s.length();
            if (max < len) {
                answer = s;
                max = len;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        StringIndex index = new StringIndex();
        System.out.println(index.solution("It is timee to study"));
    }
}
