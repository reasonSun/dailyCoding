package com.example.inflern.string;

public class StringConversion {
    private String solution(String str) {
        String answer = "";

        //str의 for문을 먼저 돌리고
        //각 문자가 대문자면 -> 소문자로 변환, 소문자면 -> 대문자로 변환
        //아스키넘버 대문자 : 65 ~ 90/ 소문자 : 97 ~ 122
        for (char c : str.toCharArray()) {
            if(Character.isLowerCase(c)) answer += Character.toUpperCase(c);
            else answer += Character.toLowerCase(c);
        }

        return answer;
    }

    public static void main(String[] args) {
        StringConversion conversion = new StringConversion();
        System.out.println(conversion.solution("aAbBSsdD"));
    }
}
