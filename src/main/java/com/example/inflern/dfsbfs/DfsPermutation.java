package com.example.inflern.dfsbfs;

public class DfsPermutation {
    static int n,m;
    static int[] arr, perArr, ch;

    private void dfs(int level) {
        if (level == m) {
            for (int i : perArr) System.out.print(i + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    perArr[level] = arr[i];
                    dfs(level + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        DfsPermutation permutation = new DfsPermutation();
        n=3;
        m=2;
        arr = new int[]{3, 6, 9};
        perArr = new int[m];
        ch = new int[n];

        permutation.dfs(0);
    }
}
