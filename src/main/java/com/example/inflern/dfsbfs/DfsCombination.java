package com.example.inflern.dfsbfs;

public class DfsCombination {
    static int[] combi;
    static int n,m;

    private void dfs(int level, int s) {
        if (level == m) {
            for(int x : combi) System.out.print(x + " ");
            System.out.println();
        } else{
            for (int i = s; i <= n; i++) {
                combi[level] = i;
                dfs(level + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        DfsCombination combination = new DfsCombination();
        n = 4;
        m = 2;
        combi = new int[m];

        combination.dfs(0,1);

    }
}
