package com.example.inflern.dfsbfs;

import java.util.Arrays;
import java.util.Comparator;

public class DfsCoin {
    static int n,m,answer=Integer.MAX_VALUE;

    private void dfs(int level, int sum, Integer[] arr) {
        if(sum > m) return;
        if(level>= answer) return;
        if (sum == m) {
            answer = Math.min(answer, level);
        }else{
            for (int i = 0; i < n; i++) {
                dfs(level + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        DfsCoin coin = new DfsCoin();
        n = 3;
        Integer[] arr = {1, 2, 5};
        Arrays.sort(arr, Comparator.reverseOrder());
        m = 15;

        coin.dfs(0, 0, arr);
        System.out.println(answer);
    }
}
