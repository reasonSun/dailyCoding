package com.example.programmers.level1;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

public class NumberPartner {

    public static void main(String[] args) {
        NumberPartner partner = new NumberPartner();
        String x = "001202030011941929391984929399192993011020391392001312312222221444444441323142344222231239";
        String y = "1932038102939393884720391038293014802930191910010023132333331312322231323232434251312314424000";
        System.out.println(partner.solution(x, y));
    }
/* 형 변환 문제로 시간초과 발생 -> 0,-1이 나오는 케이스를 확인하기 위해 BigInteger, Integer로 형변환하면 타임아웃이나 NFE 발생*/
    public String solution(String x, String y) {
        StringBuilder sb = new StringBuilder();
        Integer[] xArr = new Integer[x.length()];
        Integer[] yArr = new Integer[y.length()];

        for (int i = 0; i < x.length(); i++) {
            xArr[i] = Character.getNumericValue(x.charAt(i));
        }

        for (int i = 0; i < y.length(); i++) {
            yArr[i] = Character.getNumericValue(y.charAt(i));
        }

        Arrays.sort(xArr, Collections.reverseOrder());
        Arrays.sort(yArr, Collections.reverseOrder());

        int p1 = 0, p2 = 0;

        while (xArr.length > p1 && yArr.length > p2) {
            if (xArr[p1] == yArr[p2]) {
                sb.append(xArr[p1]);
                p1++;
                p2++;
            } else if (xArr[p1] > yArr[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

//        BigInteger answer = new BigInteger(String.valueOf(sb));

        if (sb.toString().equals("")) {
            return "-1";
        } else if (sb.toString().startsWith("0")) {
            return "0";
        } else {
            return sb.toString();
        }
    }
}
