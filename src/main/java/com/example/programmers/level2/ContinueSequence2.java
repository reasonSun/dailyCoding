package com.example.programmers.level2;

import java.util.HashSet;
import java.util.Set;

public class ContinueSequence2 {
    public static void main(String[] args) {
        ContinueSequence2 sequence2 = new ContinueSequence2();
        int[] elements = {7, 9, 1, 1, 4};
        System.out.println(sequence2.solution(elements));

    }

    public int solution(int[] elements) {
        Set<Integer> sumSet = new HashSet<>();
        int len = elements.length;
        for (int level = 1; level <= len; level++) {
            int sum = 0;
            for (int rt = 0; rt < len; rt++) {
                if (rt == 0) {
                    for (int i = 0; i < level; i++) {
                        sum += elements[i];
                    }
                } else{
                    sum -= elements[rt - 1];
                    sum += elements[(rt + level - 1) % len];
                }
                sumSet.add(sum);

            }
        }
        return sumSet.size();
    }

}
