package com.example.programmers.level2;

public class BinaryNextBigNum {
    public static void main(String[] args) {
        BinaryNextBigNum num = new BinaryNextBigNum();
        int n = 78;
        System.out.println(num.solution(n));
    }

    // toBinaryString을 사용해서 풀이했다가 효율성 통과를 하지 못했는데 Integer.bitCount()함수를 사용해서 통과 ->2진수의 1의 개수를 가져오는 변수
    private int solution(int n) {

        int originCnt = Integer.bitCount(n);
        int plusCnt = 0;
        int plusNum = n;
        while (originCnt != plusCnt) {
            plusNum++;
            plusCnt = Integer.bitCount(plusNum);
        }

        return plusNum;

    }
}
