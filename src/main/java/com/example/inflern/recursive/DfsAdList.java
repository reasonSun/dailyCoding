package com.example.inflern.recursive;

import java.util.ArrayList;
import java.util.Scanner;

public class DfsAdList {
    static int n,m,answer=0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    private int dfs(int v) {
        if (v == n) {
            answer++;
        }else{
            for (int nextV : graph.get(v)) {
                if (ch[nextV] == 0) {
                    ch[nextV] = 1;
                    dfs(nextV);
                    ch[nextV] = 0;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        DfsAdList test = new DfsAdList();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        ch=new int[n+1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph.get(a).add(b);
        }
        ch[1]=1;
        test.dfs(1);
        System.out.println(answer);
    }
}
