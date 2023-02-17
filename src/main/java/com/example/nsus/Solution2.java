package com.example.nsus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        Solution2 solution2 = new Solution2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String englishNum = br.readLine();
        System.out.println(solution2.solution(englishNum));
    }

    private String solution(String englishNum) {
        Map<String, String> transferMap = new HashMap<>();
        transferMap.put("one", "일");
        transferMap.put("two", "이");
        transferMap.put("three", "삼");
        transferMap.put("four", "사");
        transferMap.put("five", "오");
        transferMap.put("six", "육");
        transferMap.put("seven", "칠");
        transferMap.put("eight", "팔");
        transferMap.put("nine", "구");
        transferMap.put("ten", "십");
        transferMap.put("eleven", "십일");
        transferMap.put("twelve", "십이");
        transferMap.put("thirteen", "십삼");
        transferMap.put("fourteen", "십사");
        transferMap.put("fifteen", "십오");
        transferMap.put("sixteen", "십육");
        transferMap.put("seventeen", "십칠");
        transferMap.put("eighteen", "십팔");
        transferMap.put("nineteen", "십구");
        transferMap.put("twenty", "이십");
        transferMap.put("thirty", "삼십");
        transferMap.put("forty", "사십");
        transferMap.put("fifty", "오십");
        transferMap.put("sixty", "육십");
        transferMap.put("seventy", "칠십");
        transferMap.put("eighty", "팔십");
        transferMap.put("ninety", "구십");
        transferMap.put("hundred", "백");
        transferMap.put("hundreds", "백");

        englishNum = englishNum.toLowerCase();
        String[] arr = englishNum.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            if ("hundred".equals(s) && "일".equals(sb.toString())) {
                sb.setLength(0);
            }
            sb.append(transferMap.get(s));

        }
        return String.valueOf(sb);
    }
}
