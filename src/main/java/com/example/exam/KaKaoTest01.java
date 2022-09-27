package com.example.exam;

import java.util.HashMap;
import java.util.Map;

public class KaKaoTest01 {
    public static void main(String[] args) {
        KaKaoTest01 test01 = new KaKaoTest01();
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        for(int n : test01.solution(today, terms, privacies)) System.out.println(n);
    }

    private int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer={};
        Map<String, String> termsMap = new HashMap<>();
        for (String c : terms) {
            for (String s : c.split(" ")) {
            }
        }

        return answer;
    }
}
