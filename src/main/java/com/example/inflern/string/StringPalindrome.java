package com.example.inflern.string;

public class StringPalindrome {

    private String solution(String str) {
        String answer = "NO";
//        str = str.toUpperCase();
//        int len = str.length();
//        for (int i = 0; i < len / 2; i++) {
//            if (str.charAt(i) != str.charAt(len - i - 1)) {
//                return "NO";
//            }
//        }

        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        StringPalindrome palindrome = new StringPalindrome();
        System.out.println(palindrome.solution("Goog"));
    }
}
