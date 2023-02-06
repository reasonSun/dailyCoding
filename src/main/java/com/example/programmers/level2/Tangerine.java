package com.example.programmers.level2;

import java.util.HashSet;
import java.util.Set;

public class Tangerine {
    public static void main(String[] args) {
        Tangerine ta = new Tangerine();
        int k = 1;
        int[] tangerine = {1, 1, 1, 1, 2, 2, 2, 3};
        System.out.println(ta.solution(k, tangerine));
    }

    static int min = Integer.MAX_VALUE;
    static int[] chk, perArr;
    public int solution(int k, int[] tangerine) {
        chk = new int[tangerine.length];
        perArr = new int[k];
        dfs(0, k, tangerine);
        return min;
    }

    private void dfs(int level, int k, int[] tangerine) {
        if (level == k) {
            Set<Integer> set = new HashSet<>();
            for (int n : perArr) set.add(n);
            min = Math.min(min, set.size());
        } else {
            for (int i = 0; i < tangerine.length; i++) {
                if (chk[i] == 0) {
                    chk[i] = 1;
                    perArr[level] = tangerine[i];
                    dfs(level + 1, k, tangerine);
                    chk[i] = 0;
                }
            }
        }

    }

}
