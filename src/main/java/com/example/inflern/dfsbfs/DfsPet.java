package com.example.inflern.dfsbfs;

public class DfsPet {
    static int limitCnt,num, answer = Integer.MIN_VALUE;

    private void dfs(int level, int sum, int[] arr) {
        if(sum > limitCnt) return;
        if (level == num) {
            answer = Math.max(answer, sum);
        }else{
            dfs(level+1, sum + arr[level], arr);
            dfs(level + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        DfsPet pet = new DfsPet();
        limitCnt = 259;
        num = 5;
        int[] arr = {81, 58, 42, 33, 61};

        pet.dfs(0, 0, arr);

        System.out.println(answer);
    }
}
