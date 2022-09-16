package com.example.inflern.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class StackKaKao {

    public static void main(String[] args) {
        StackKaKao kaKao = new StackKaKao();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] board = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]=kb.nextInt();
            }
        }
        int m=kb.nextInt();
        int[] moves=new int[m];
        for(int i=0; i<m; i++) moves[i]=kb.nextInt();
        System.out.println(kaKao.solution(board, moves));

    }

    private int solution(int[][] board, int[] moves) {

        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) {
                    int temp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if (!stack.isEmpty() && temp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    }else{
                        stack.push(temp);
                    }
                    break;
                }
            }
        }

        return answer;
    }
}
//5
//0 0 0 0 0
//0 0 1 0 3
//0 2 5 0 1
//4 2 4 4 2
//3 5 1 3 1
//8
//1 5 3 5 1 2 1 4