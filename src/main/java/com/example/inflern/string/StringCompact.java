package com.example.inflern.string;

public class StringCompact {

    private String solution(String str) {
        String answer = "";
        str = str + " ";
        int cnt = 1;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            }else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        StringCompact compact = new StringCompact();
        System.out.println(compact.solution("KKHSSSSSSSE"));
    }
}
