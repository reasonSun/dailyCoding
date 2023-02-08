package com.example.programmers.level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RollCake {
    public static void main(String[] args) {
        RollCake rollCake = new RollCake();
        int[] topping = {1, 2, 3, 1, 4};
        System.out.println(rollCake.solution(topping));
    }

    public int solution(int[] topping) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int answer = 0;

        set.add(topping[0]);
        for (int i = 1; i < topping.length; i++) {
            map.put(topping[i], map.getOrDefault(topping[i], 0) + 1);
        }

        for (int i = 1; i < topping.length; i++) {
            set.add(topping[i]);
            if (map.get(topping[i]) == 1) {
                map.remove(topping[i]);
            }else{
                map.put(topping[i], map.get(topping[i]) - 1);
            }

            if (set.size() == map.size()) {
                answer++;
            }
        }

        return answer;
    }
}
