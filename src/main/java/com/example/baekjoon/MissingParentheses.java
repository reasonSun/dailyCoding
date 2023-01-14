package com.example.baekjoon;

import java.util.Scanner;

public class MissingParentheses {

    public static void main(String[] args) {
        MissingParentheses parentheses = new MissingParentheses();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(parentheses.solution(str));
    }

    private int solution(String str) {
        int answer =0;
        String[] minusArr = str.split("-");
        for (int i = 0; i< minusArr.length; i++) {
            int temp = 0;
            String[] plusArr = minusArr[i].split("\\+");
            for (int j = 0; j < plusArr.length; j++) {
                temp += Integer.parseInt(plusArr[j]);
            }
            if (i == 0) {
                answer = temp;
            }else{
                answer -= temp;
            }
            System.out.println(temp);
        }
        return answer;
    }
}
