package com.example.programmers.level2;

public class BinaryCount {
    public static void main(String[] args) {
        BinaryCount count = new BinaryCount();
        String s = "110010101001"; //[3,8]
        for (int a : count.solution(s)) System.out.println(a);

    }

    private int[] solution(String s) {
        String binaryStr = s;
        String noneBinaryStr = "";
        int transferCnt = 0, zeroCnt = 0;
        while (!"1".equals(binaryStr)) {
            zeroCnt += binaryStr.chars()
                    .filter(c -> c == '0')
                    .count();
            noneBinaryStr= binaryStr.replace("0", "");
            binaryStr = Integer.toBinaryString(noneBinaryStr.length());

            transferCnt++;
        }

        return new int[]{transferCnt, zeroCnt};
    }
}
