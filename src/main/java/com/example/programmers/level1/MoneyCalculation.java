package com.example.programmers.level1;

public class MoneyCalculation {
    public static void main(String[] args) {
        MoneyCalculation calculation = new MoneyCalculation();

        int price = 2500;
        int money = 1000000000;
        int count = 2500;

        System.out.println(calculation.solution(price,money,count));
    }

    public long solution(int price, int money, int count) {
        long total = 0, answer = -1;
        for (int i = 1; i <= count; i++) {
            total += price * i;
        }
        answer = total - money > 0 ? total-money : 0;

        return answer;
    }
}
