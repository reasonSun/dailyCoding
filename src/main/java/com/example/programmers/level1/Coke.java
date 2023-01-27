package com.example.programmers.level1;

public class Coke {
    public static void main(String[] args) {
        Coke coke = new Coke();
        int a = 2;
        int b = 1;
        int emptyCnt = 20;

        System.out.println(coke.solution(a,b,emptyCnt));
    }

    public int solution(int a, int b, int emptyCnt) {
        int answer = 0;
        while(emptyCnt>=a){
            int colaCnt = (emptyCnt / a) * b;
            int remainderCnt = emptyCnt % a;
            emptyCnt = colaCnt + remainderCnt;
            answer+= colaCnt;
        }

        return answer;
    }

}
