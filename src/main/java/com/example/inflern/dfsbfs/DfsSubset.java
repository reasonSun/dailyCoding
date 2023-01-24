package com.example.inflern.dfsbfs;

public class DfsSubset {
    static String answer = "NO";
    static int n = 6;
    static int total;
    boolean flag = false;

    private void dfs(int level, int sum, int[] arr) {
        if (flag) {
            return;
        }
        if(sum > total/2) return;
        if (level == n) {
            if ((total-sum) == sum) {
                answer = "YES";
                flag = true;
            }
        }else{
            dfs(level + 1, sum + arr[level], arr); //해당원소를 넣는 경우
            dfs(level + 1, sum, arr); //해당 원소를 넣지 않는경우
        }

    }
    public static void main(String[] args) {
        DfsSubset subset = new DfsSubset();
        int[] arr = {1, 3, 5, 6, 7, 10};
        for (int num : arr) {
            total += num;
        }
        System.out.println("total = " + total);

        subset.dfs(0, 0, arr);

        System.out.println("answer = " + answer);
    }
}
