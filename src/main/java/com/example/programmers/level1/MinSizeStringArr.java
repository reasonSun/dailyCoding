package com.example.programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class MinSizeStringArr {
    public static void main(String[] args) {
        MinSizeStringArr min = new MinSizeStringArr();
        String t = "1221351118575141528544";
        String p = "125111111111111111";

        System.out.println(min.solution(t, p));

    }

    public int solution(String t, String p) {
        int answer = 0;
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < t.length() - (p.length()-1); i++) {
            list.add(Long.parseLong(t.substring(i, i+p.length())));
        }
        Long pNum = Long.parseLong(p);
        for (Long num : list) {
            if (num <= pNum) answer++;
        }
        return  answer;
    }
}
