package com.example.inflern.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashSales {
    public static void main(String[] args) {
        HashSales sales = new HashSales();
        int num = 7, k = 4;
        int[] arr = {20, 12, 20, 10, 23, 17, 1};

        for (int x : sales.solution(num, k, arr)) {
            System.out.print(x + " ");
        }
    }

    private List<Integer> solution(int num, int k, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        //sliding window
        int lt = 0;
        for (int rt = k - 1; rt < num; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }
            lt++;
        }

        return answer;
    }
}
