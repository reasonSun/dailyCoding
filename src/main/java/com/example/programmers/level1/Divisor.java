package com.example.programmers.level1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Divisor {
    public static void main(String[] args) {
        Divisor divisor = new Divisor();
        int left = 13, right = 17;
        System.out.println(divisor.solution(left, right));
    }

    public int solution(int left, int right) {
        int cnt = 0;
        int answer = 0;
        Map<Integer, Integer> tree = new HashMap<>();
        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            tree.put(i, cnt);
            cnt = 0;
        }
        for (int i : tree.keySet()) {
            if(tree.get(i) % 2 == 0) answer += i;
            else answer -= i;
        }
        return answer;
    }
}
