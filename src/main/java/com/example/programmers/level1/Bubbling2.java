package com.example.programmers.level1;

public class Bubbling2 {
    public static void main(String[] args) {
        Bubbling2 bubbling2 = new Bubbling2();
        String[] bubbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(bubbling2.solution(bubbling));
    }

    private int solution(String[] bubbling) {
        int answer = 0;
        for (int i = 0; i < bubbling.length; i++) {
            if(bubbling[i].contains("ayaaya")
                    || bubbling[i].contains("yeye")
                    || bubbling[i].contains("woowoo")
                    || bubbling[i].contains("mama")){
                continue;
            }
            bubbling[i] = bubbling[i].replace("aya", " ");
            bubbling[i] = bubbling[i].replace("ye", " ");
            bubbling[i] = bubbling[i].replace("woo", " ");
            bubbling[i] = bubbling[i].replace("ma", " ");
            bubbling[i] = bubbling[i].replace(" ", "");

            if(bubbling[i].length() == 0) answer++;
        }

        return answer;

    }
}
