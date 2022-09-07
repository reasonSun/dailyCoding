package com.example.inflern.string;

public class StringDuplRemove {

    private String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        StringDuplRemove duplRemove = new StringDuplRemove();
        System.out.println(duplRemove.solution("aabbccddee"));
    }

}
