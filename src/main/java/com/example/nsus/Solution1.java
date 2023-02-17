package com.example.nsus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution1 {
    /*
input
6
ada
bean
adam
ace
be
ac

result
a 4
ac 2
ace 1
ad 2
ada 2
adam 1
b 2
be 2
bea 1
bean 1
*/
    public static void main(String[] args) throws IOException {
        Solution1 solution1 = new Solution1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        for(String s : solution1.solution(N, arr)) System.out.println(s);;
    }

    private List<String> solution(int n, String[] arr) {
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new TreeMap<>();
        for (String s : arr) {
            for (char c : s.toCharArray()) {
                sb.append(c);
                map.put(String.valueOf(sb), 0);
            }
            sb.setLength(0);
        }
        for (String key : map.keySet()) {
            for (String s : arr) {
                if (s.startsWith(key)) {
                    map.put(key, map.get(key) + 1);
                }
            }
        }
        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            list.add(key + " " + map.get(key));
        }
        return list;
    }
}
