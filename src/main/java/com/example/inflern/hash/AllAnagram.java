package com.example.inflern.hash;

import java.util.HashMap;
import java.util.Map;

public class AllAnagram {

    public static void main(String[] args) {
        AllAnagram anagram = new AllAnagram();

        System.out.println(anagram.solution("bacaAacba", "abc"));
    }

    private int solution(String str1, String str2) {
        int answer = 0;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(char c : str2.toCharArray()) map2.put(c, map2.getOrDefault(c, 0) + 1);

        int num = str2.length() - 1;
        for (int i = 0; i < num; i++) {
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) +1);
        }

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        int lt = 0;
        for (int rt = num; rt < str1.length(); rt++) {
            map1.put(str1.charAt(rt), map1.getOrDefault(str1.charAt(rt), 0) + 1);
            if (map2.equals(map1)) {
                answer++;
            }
            map1.put(str1.charAt(lt), map1.get(str1.charAt(lt)) - 1);
            if (map1.get(str1.charAt(lt)) == 0) {
                map1.remove(str1.charAt(lt));
            }
            lt++;
        }

        return answer;
    }
}
