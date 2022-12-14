package com.example.inflern.dp;

import java.util.Arrays;
import java.util.Scanner;

public class CoinKnapsack {
    static int n, m;
    static int[] dy; //i를 만드는데 드는 최소 동전 개수
    public int solution(int[] coin){
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0]=0;
        for(int i=0; i<n; i++){
            for(int j=coin[i]; j<=m; j++){
                dy[j]=Math.min(dy[j], dy[j-coin[i]]+1);
            }
        }
        return dy[m];
    }
    public static void main(String[] args) {
        CoinKnapsack coinKnapsack = new CoinKnapsack();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        m=kb.nextInt();
        dy=new int[m+1];
        System.out.print(coinKnapsack.solution(arr));
    }
}
/*
3
1 2 5
15
* */

/*
10 4200
1 5 10 50 100 500 1000 5000 10000 50000
*/
