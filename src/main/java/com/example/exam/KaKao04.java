package com.example.exam;

public class KaKao04 {

    public static void main(String[] args) {
        KaKao04 kaKao04 = new KaKao04();
        long[] numbers = {63, 111, 95};
        for (long n : numbers) {
            String binary = Long.toBinaryString(n);
            System.out.println("binary = " + binary.length());
        }
    }
}
