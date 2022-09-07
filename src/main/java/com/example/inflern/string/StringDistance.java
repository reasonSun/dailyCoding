package com.example.inflern.string;

public class StringDistance {

    private int[] solution(String str, char word) {
        int[] answer = new int[str.length()];
        int distance = 1000;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == word) {
                distance = 0;
            } else {
                distance++;
            }
            answer[i] = distance;
        }
        distance = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == word) {
                distance = 0;
            } else {
                distance++;
                answer[i] = Math.min(answer[i], distance);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        StringDistance distance = new StringDistance();
        String str = "teachermode";
        char word = 'e';

        for (int x : distance.solution(str, word)) {
            System.out.print(+ x);
        }
    }
}
