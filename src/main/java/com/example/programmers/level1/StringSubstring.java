package com.example.programmers.level1;

public class StringSubstring {
    public static void main(String[] args) {
        StringSubstring substring = new StringSubstring();
        String s = "abracadabra";
        System.out.println(substring.solution(s));
    }

    public int solution(String s) {
        int cnt1=0, cnt2=0;
        int answer = 0;
        String fixStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (fixStr == "") fixStr = String.valueOf(s.charAt(i));

            if (fixStr.equals(String.valueOf(s.charAt(i)))) cnt1++;
            else cnt2++;

            if (cnt1 == cnt2) {
                answer++;
                cnt1 = 0;
                cnt2 = 0;
                fixStr = "";
            }
        }

        if(fixStr != "") answer++;

        return answer;
    }
}
