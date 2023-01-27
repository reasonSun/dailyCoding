package com.example.programmers.level1;


public class Trio {
    int cnt =0;
    int[] chk, perArr;
    public static void main(String[] args) {
        Trio trio = new Trio();
        int[] number = {-1, 1, -1, 1};
        System.out.println(trio.solution(number));
    }

    public int solution(int[] number) {
        chk = new int[number.length];
        perArr = new int[3];
        combination(0, 0, number);
        return cnt;
    }

    public void combination(int level, int start, int[] number) {
        if (level == 3) {
            int sum = 0;
            for (int n : perArr) {
                sum += n;
            }
            if(sum == 0) cnt++;
        }else{
            for (int i = start; i < number.length; i++) {
                perArr[level] = number[i];
                combination(level+1, i+1, number);
            }
        }
    }
}
