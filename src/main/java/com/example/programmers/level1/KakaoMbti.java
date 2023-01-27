package com.example.programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class KakaoMbti {
    public static void main(String[] args) {
        KakaoMbti mbti = new KakaoMbti();
        String[] survey = {"TR", "RT", "TR"};
        int[] choice = {7, 1, 3};
        System.out.println(mbti.solution(survey, choice));
    }

    public String solution(String[] survey, int[] choice) {
        String answer = "";

        Map<Character, Integer> mbtiMap = new HashMap<>();
        mbtiMap.put('R', 0);
        mbtiMap.put('T', 0);
        mbtiMap.put('C', 0);
        mbtiMap.put('F', 0);
        mbtiMap.put('J', 0);
        mbtiMap.put('M', 0);
        mbtiMap.put('A', 0);
        mbtiMap.put('N', 0);

        for (int i = 0; i < survey.length; i++) {
            switch (choice[i]) {
                case 1 :
                    mbtiMap.put(survey[i].charAt(0), mbtiMap.get(survey[i].charAt(0)) + 3);
                    break;
                case 2 :
                    mbtiMap.put(survey[i].charAt(0), mbtiMap.get(survey[i].charAt(0)) + 2);
                    break;
                case 3 :
                    mbtiMap.put(survey[i].charAt(0), mbtiMap.get(survey[i].charAt(0)) + 1);
                    break;
                case 5 :
                    mbtiMap.put(survey[i].charAt(1), mbtiMap.get(survey[i].charAt(1)) + 1);
                    break;
                case 6 :
                    mbtiMap.put(survey[i].charAt(1), mbtiMap.get(survey[i].charAt(1)) + 2);
                    break;
                case 7 :
                    mbtiMap.put(survey[i].charAt(1), mbtiMap.get(survey[i].charAt(1)) + 3);
                    break;
            }
        }
        answer += mbtiMap.get('R') >= mbtiMap.get('T') ? 'R': 'T';
        answer += mbtiMap.get('C') >= mbtiMap.get('F') ? 'C': 'F';
        answer += mbtiMap.get('J') >= mbtiMap.get('M') ? 'J': 'M';
        answer += mbtiMap.get('A') >= mbtiMap.get('N') ? 'A': 'N';

        return answer;
    }
}
