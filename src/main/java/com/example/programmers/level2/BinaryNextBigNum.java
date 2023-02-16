package com.example.programmers.level2;

public class BinaryNextBigNum {
    public static void main(String[] args) {
        BinaryNextBigNum num = new BinaryNextBigNum();
        int n = 78;
        System.out.println(num.solution(n));
    }

    private int solution(int n) {

        String originBinary = Integer.toBinaryString(n);
        long originCnt = originBinary.chars()
                .filter(c -> c == '1')
                .count();

        long plusCnt = 0L;
        int plusNum = n;
        String plusBinary = "";
        while (originCnt != plusCnt) {
            plusNum++;
            plusBinary = Integer.toBinaryString(plusNum);
            plusCnt = plusBinary.chars()
                    .filter(c -> c=='1')
                    .count();
        }

        return plusNum;

    }
}
