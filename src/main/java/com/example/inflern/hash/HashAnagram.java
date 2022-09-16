package com.example.inflern.hash;

import java.util.HashMap;
import java.util.Map;

public class HashAnagram {
    public static void main(String[] args) {
        HashAnagram anagram = new HashAnagram();
        System.out.println(anagram.solution("AbaAeCe","baeeACA"));
    }

    private String solution(String str1, String str2) {
        String answer = "YES";
        Map<Character, Integer> map = new HashMap<>();
        for (char x : str1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for (char x : str2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                answer = "NO";
                break;
            }
            map.put(x, map.get(x)-1);
        }

        //yuseon's coding
        /*Map<Character, Integer> strMap1 = new HashMap<>();
        Map<Character, Integer> strMap2 = new HashMap<>();
        for (char c :
                str1.toCharArray()) {
            strMap1.put(c, strMap1.getOrDefault(c, 0)+1);
        }
        for (char x :
                str2.toCharArray()) {
            strMap2.put(x, strMap2.getOrDefault(x, 0) + 1);
        }

        for (char key : strMap1.keySet()) {
            System.out.println("strMap2.getOrDefault(key, 0) = " + strMap2.getOrDefault(key, 0));
            if (strMap1.get(key) == strMap2.getOrDefault(key, 0)) {
                answer = "YES";
            }else {
                answer = "NO";
                break;
            }
        }
        System.out.println("strMap1 = " + strMap1);
        System.out.println("strMap2 = " + strMap2);*/

        return answer;
    }
}
