package com.example.inflern.dfsbfs;

public class DfsDuplPermutation {
    static int n,m;
    static int[] pm;

    private void dfs(int level) {
        if (level == m) {
            for (int num : pm) {
                System.out.print(num + " ");
            }
            System.out.println();
        }else {
            for (int i = 1; i <= n; i++) {
                pm[level] = i;
                dfs(level + 1);
            }
        }
    }

    public static void main(String[] args) {
        DfsDuplPermutation permutation = new DfsDuplPermutation();
        n = 3;
        m = 2;
        pm = new int[m];
        permutation.dfs(0);
    }
}
