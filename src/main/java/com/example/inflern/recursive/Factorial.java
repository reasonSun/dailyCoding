package com.example.inflern.recursive;

public class Factorial {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.dfs(5));
    }

    private int dfs(int n) {
        if(n == 1) return 1;
        else{
            return n * dfs(n - 1);
        }

    }
}
