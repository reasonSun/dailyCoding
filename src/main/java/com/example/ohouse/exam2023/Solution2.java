package com.example.ohouse.exam2023;

public class Solution2 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution("bucketplace"));
    }

    private String solution(String str) {
        String vowels = "aeiouAEIOU";
        StringBuilder reversed = new StringBuilder();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                reversed.append(str.charAt(i));
            }
        }

        int vowelIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (vowels.indexOf(currentChar) != -1) {
                answer.append(reversed.charAt(reversed.length() - vowelIndex - 1));
                vowelIndex++;
            } else {
                answer.append(currentChar);
            }
        }
        return answer.toString();
    }
}
