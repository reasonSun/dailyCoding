package com.example.inflern.string;

public class StringNumber {
    private int solution(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)) answer += c;
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        StringNumber number = new StringNumber();
        System.out.println(number.solution("g0en2T0s8eSoft"));
    }
}
