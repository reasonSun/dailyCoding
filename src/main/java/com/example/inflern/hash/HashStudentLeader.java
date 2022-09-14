package com.example.inflern.hash;

import java.util.HashMap;
import java.util.Map;

public class HashStudentLeader {

    public static void main(String[] args) {
        HashStudentLeader leader = new HashStudentLeader();
        System.out.println(leader.solution(15, "BACBACCACCBDEDE"));
    }

    private char solution(int num, String str) {
        char answer = ' ';
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 알아두면 유용한 hashmap 메서드
        System.out.println(map.containsKey('A'));
        System.out.println(map.size());
        System.out.println(map.remove('C'));
        System.out.println(map.size());

        System.out.println(5%-3);

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;

    }
}
