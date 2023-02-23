package com.example.programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class EnglishEndWord {
    public static void main(String[] args) {
        EnglishEndWord word = new EnglishEndWord();
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        for(int a : word.solution(n, words)) System.out.println(a);
    }

    private int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Map<String, Integer> wordMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                String preWord = words[i - 1];
                String currWord = words[i];

                char preEnd = preWord.charAt(preWord.length() - 1);
                char currStart = currWord.charAt(0);

                if (wordMap.containsKey(words[i]) || preEnd != currStart) {
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    return answer;
                }
            }
            wordMap.put(words[i], 1);
        }

        return answer;

    }
}
