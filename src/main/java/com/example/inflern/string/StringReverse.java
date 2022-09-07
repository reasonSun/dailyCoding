package com.example.inflern.string;

import java.util.ArrayList;
import java.util.Scanner;

public class StringReverse {
    private ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            char[] word = s.toCharArray();
            int lt = 0, rt = s.length()-1;
            while (lt < rt) {
                char tmp = word[lt];
                word[lt] = word[rt];
                word[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(word);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        StringReverse reverse = new StringReverse();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }
        for (String x : reverse.solution(n, str)) {
            System.out.println("x = " + x);
        }
    }
}
