package com.example.nicednb;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        Task3 task = new Task3();
        String[][] friends = new String[][]{
                {"david", "frank"},
                {"demi", "frank"},
                {"frank", "james"},
                {"demi", "james"},
                {"claire", "frank"}
        };
        String userId = "david";
        task.solution(friends,userId);
    }

    private void solution(String[][] friends, String userId) {

    }
}
