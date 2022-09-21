package com.example.inflern.recursive;

public class Fibonacci {
    static int[] fibo;


    //재귀, for문 중에서는 당연히 for문이 성능이 더 좋다. 재귀는 stack frame이 계속 생기기 때문에 성능이 좋지 않음.
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int n = 45;
        fibo = new int[n + 1];
        fibonacci.dfs(n);
        for (int i = 1; i <= n; i++) {
            System.out.println(fibo[i]);
        }
    }

    private int dfs(int n) {
        if(fibo[n] > 0) return fibo[n];
        if(n==1 || n==2) return fibo[n] =1;
        else return fibo[n] = dfs(n-2)+dfs(n-1);
    }
}
