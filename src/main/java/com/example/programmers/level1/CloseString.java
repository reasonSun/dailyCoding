package com.example.programmers.level1;

public class CloseString {
    public static void main(String[] args) {
        CloseString string = new CloseString();
        String s = "foobar";

        for(int i : string.solution(s)) System.out.print(i + " ");
    }

    public int[] solution(String s) {
        int[] result = new int[s.length()];
        result[0] = -1;
        for (int i = 1; i < s.length(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    result[i] = i - j;
                    break;
                } else {
                    result[i] = -1;
                }
            }
        }
        return result;
    }
}
