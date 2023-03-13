package com.example.programmers.level2;

import java.util.HashSet;
import java.util.Set;

public class PrimeSearch {
    static Set<Integer> combSet = new HashSet<>();
    public static void main(String[] args) {
        PrimeSearch search = new PrimeSearch();
        System.out.println(search.solution("17"));
    }

    private void dfs(String comb, String numbers) {
        if (!comb.isEmpty()) {
            combSet.add(Integer.valueOf(comb));
        }
        for (int i = 0; i < numbers.length(); i++) {
            dfs(comb + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i + 1));
        }
    }

    private int solution(String numbers) {
        // 1.numbers 로 만들 수 있는 숫자 구하기
        dfs("", numbers);
        // 2. 구한 숫자들 중에 소수 찾기
        int count = 0;
        for (int num : combSet) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;

    }

    private boolean isPrime(int num) {
        // 1. 0과 1은 소수가 아니다
        if (num == 0 || num == 1)
            return false;

        // 2. 에라토스테네스의 체의 limit 숫자를 계산한다.
        int lim = (int)Math.sqrt(num);

        // 3. 에라토스테네스의 체에 따라 lim까지 배수 여부를 확인한다.
        for (int i = 2; i <= lim; i++)
            if (num % i == 0)
                return false;

        return true;

    }
}
