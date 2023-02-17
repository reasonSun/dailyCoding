package com.example.nsus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution3 {
    //배열 90도 회전시키기
    public static void main(String[] args) throws IOException {
        Solution3 solution3 = new Solution3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String[][] arr = new String[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = st.nextToken();
            }
        }
        String[][] rotateArr;
        rotateArr = rotate(arr,n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==n-1) System.out.print(rotateArr[i][j]);
                else System.out.print(rotateArr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static String[][] rotate(String[][] arr, int n) {
        String[][] answer = new String[n][n];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = arr[j][n-1-i];
            }
        }
        return answer;
    }
}
