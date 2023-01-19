package com.example.baekjoon.dfs;

import java.util.Arrays;
import java.util.Scanner;

public class B_1759 {
    static char[] list, code;
    static int L,C;
    public static void main(String[] args) {
        B_1759 b1759 = new B_1759();
        Scanner scanner = new Scanner(System.in);
        L = scanner.nextInt();
        C = scanner.nextInt();
        list = new char[C];
        code = new char[L];
        for (int i = 0; i < C; i++) {
            list[i] = scanner.next().charAt(0);
        }

        Arrays.sort(list);

        b1759.dfs(0, 0);
    }

    private void dfs(int level, int idx) {
        if (level == L) {
            if(valid()){
                for(char c : code) System.out.print(c);
                System.out.println();
            }
            return;
        }else{
            for (int i = idx; i < C; i++) {
                code[level] = list[i];
                dfs(level + 1, i + 1);
            }
        }
    }

    public boolean valid() {
        int vowel = 0, consonant = 0;
        for (char c : code) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            }else{
                consonant++;
            }
        }
        if (vowel >= 1 && consonant >= 2) {
            return true;
        }
        return false;
    }
}
