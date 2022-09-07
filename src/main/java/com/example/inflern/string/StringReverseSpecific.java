package com.example.inflern.string;

public class StringReverseSpecific {
    private String solution(String str) {

        String answer = "";

        char[] word = str.toCharArray();
        int lt = 0, rt = str.length() -1;

        while (lt < rt) {
            if (!Character.isAlphabetic(word[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(word[rt])) {
                rt--;
            } else {
                char tmp = word[lt];
                word[lt] = word[rt];
                word[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(word);

        return answer;
    }

    public static void main(String[] args) {
        StringReverseSpecific specific = new StringReverseSpecific();
        System.out.println(specific.solution("a#b!GE*T@S"));
    }
}
