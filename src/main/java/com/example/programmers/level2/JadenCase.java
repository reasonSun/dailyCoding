package com.example.programmers.level2;

public class JadenCase {
    public static void main(String[] args) {
        JadenCase jadenCase = new JadenCase();
        String s = "3people unFollowed me";
        System.out.println(jadenCase.solution(s));
    }

    private String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int emptyCnt = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                emptyCnt= 0;
                answer.append(" ");
            }else{
                if (emptyCnt == 0) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                emptyCnt++;
            }
        }
        return String.valueOf(answer);

    }
}
