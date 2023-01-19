package com.example.baekjoon.dfs;

import java.util.Scanner;

public class B_2580 {
    static int[][] board = new int[9][9];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j]= sc.nextInt();
            }
        }

        sudoku(0, 0);
    }

    public static void sudoku(int row, int col) {
        // 행이 다 채워지면 그 다음 행의 0열부터 탐색
        if (col == 9) {
            sudoku(row+1, 0);
            return;
        }
        //행과 열을 모두 탐색한 경우
        if (row == 9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(board[i][j]+ " ");
                }
                System.out.println();
            }
            System.exit(0);
        }
        if (board[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (valid(row, col, i)) {
                    board[row][col] = i;
                    sudoku(row, col + 1);
                }
            }
            board[row][col] = 0;
            return;
        }
        sudoku(row, col+1);

    }

    public static boolean valid(int row, int col, int val) {
        for (int i = 0; i < 9; i++) {
            // 행에 val 값이 있는지 확인
            if (board[row][i] == val) {
                return false;
            }
            // 열에 val 값이 있는지 확인
            if (board[i][col] == val) {
                return false;
            }
        }

        // 네모칸 안에 val 값이 있는지 확인
        int nxRow = (row / 3) * 3;
        int nxCol = (col / 3) * 3;
        for (int i = nxRow; i < nxRow + 3; i++) {
            for (int j = nxCol; j < nxCol + 3; j++) {
                if (board[i][j] == val) {
                    return false;
                }
            }
        }
        return true;
    }
}

