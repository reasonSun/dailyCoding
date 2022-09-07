package com.example.inflern.array;

public class ArrayPrimeNumber {

    private int solution(int cnt) {
        int answer = 0;
//        List<Integer> primeNumberList = new ArrayList<>();
//
//        for (int i = 2; i < cnt; i++) {
//            if (i == 2 || i % 2 == 1) {
//                primeNumberList.add(i);
//            }
//        }
//
//        System.out.println("primeNumberList = " + primeNumberList);
//
//        answer = primeNumberList.size();

        int[] numChkArr = new int[cnt + 1];
        for (int i = 2; i <= cnt; i++) {
            if (numChkArr[i] == 0) {
                answer++;
                for(int j = i; j<=cnt; j=j+i) numChkArr[j] = 1;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        ArrayPrimeNumber primeNumber = new ArrayPrimeNumber();
        System.out.println(primeNumber.solution(20));
    }
}
