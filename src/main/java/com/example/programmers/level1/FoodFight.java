package com.example.programmers.level1;

public class FoodFight {
    public static void main(String[] args) {
        FoodFight foodFight = new FoodFight();
        int[] food = {1, 3, 4, 6};
        System.out.println(foodFight.solution(food));
    }

    private String solution(int[] food) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            if (food[i] / 2 != 0) {
                for (int j = 0; j < food[i] / 2; j++) {
                    str.append(i);
                }
            }
        }
        String tmp = new StringBuilder(str).reverse().toString();
        str.append(0);
        str.append(tmp);

        return str.toString();

    }
}
