package com.example.inflern.string;

public class StringDecryption {
    private String solution(int cnt, String str) {
        String answer="";

        for (int i = 0; i < cnt; i++) {
            String tmp = str.substring(0,7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp,2);
            answer += (char)num;
            str=str.substring(7);
        }


        return answer;
    }
    public static void main(String[] args) {
        StringDecryption decryption = new StringDecryption();
        System.out.println(decryption.solution(4, "#****###**#####**#####**##**"));
    }
}
