package com.example.inflern.string;

public class StringPalindrome2 {
    private String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");

        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        StringPalindrome2 palindrome = new StringPalindrome2();
        System.out.println(palindrome.solution("found7, time: study; Yduts; emit, 7Dnuof"));
    }
}
