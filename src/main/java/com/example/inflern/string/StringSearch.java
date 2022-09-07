package com.example.inflern.string;

import java.util.Scanner;

public class StringSearch {

    private int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for (char x : str.toCharArray()) {
            if (x == c) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        StringSearch search = new StringSearch();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        System.out.println(search.solution(str, c));
    }
}
