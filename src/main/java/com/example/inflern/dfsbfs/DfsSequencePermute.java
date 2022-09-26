package com.example.inflern.dfsbfs;

public class DfsSequencePermute {
    int[][] dy = new int[35][35];
    static int num, lastNum;
    static int[] combiArr, permuteArr, chArr;
    boolean flag = false;

    private int combi(int n, int r) {
        if(dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
        }
    }

    private void dfs(int level, int sum) {
        if(flag) return;
        if (level == num) {
            if (sum == lastNum) {
                for(int i : permuteArr) System.out.print(i + " ");
                flag = true;
            }
        }else{
            for (int i = 1; i <= num; i++) {
                if (chArr[i] == 0) {
                    chArr[i] = 1;
                    permuteArr[level] = i;
                    dfs(level + 1, sum + (permuteArr[level] * combiArr[level]));
                    chArr[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        DfsSequencePermute permute = new DfsSequencePermute();
        num = 4;
        lastNum = 16;
        combiArr = new int[num];
        permuteArr = new int[num];
        chArr = new int[num + 1];
        for (int i = 0; i < num; i++) {
            combiArr[i] = permute.combi(num - 1, i);
        }

        permute.dfs(0, 0);


    }
}
