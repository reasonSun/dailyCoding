package com.example.inflern.recursive;

import java.util.Scanner;

public class DfsPathSearch {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;
    private void dfs(int curPos) {
        if (curPos == n) {
            answer++;
        }else {
            for (int i = 0; i < n; i++) {
                if (graph[curPos][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    dfs(i);
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        DfsPathSearch search = new DfsPathSearch();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph=new int[n+1][n+1];
        ch=new int[n+1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph[a][b]=1;
        }
        ch[1]=1;
        search.dfs(1);
        System.out.println(answer);
    }
/*
input
5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5
*/

}
