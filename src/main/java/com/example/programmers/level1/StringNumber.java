package com.example.programmers.level1;

public class StringNumber {

    public static void main(String[] args) {
        StringNumber stringNumber = new StringNumber();
        String s = "one4seveneight";
        System.out.println(stringNumber.solution(s));
    }

    public int solution(String s) {
        int answer = 0;
        String[] numString = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < 10; i++) {
            s = s.replace(numString[i], num[i]);
        }
        return Integer.parseInt(s);
    }
}
