package com.example.programmers.level2;

public class DungeonGame {
    public static void main(String[] args) {
        DungeonGame game = new DungeonGame();
        int k = 80;
        int[][] dungeons = {
                {80, 20},
                {50, 40},
                {30, 10}
        };
        System.out.println(game.solution(k, dungeons));
    }
    static boolean[] visited;
    static int count = 0;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        dfs(0, k, dungeons);

        return count;
    }
    private void dfs(int level, int k, int[][] dungeons) {
        if (count == dungeons.length) {
            return;
        }else {
            for (int i = 0; i < dungeons.length; i++) {
                if (!visited[i] && dungeons[i][0] <= k) {
                    visited[i] = true;
                    dfs(level + 1, k - dungeons[i][1], dungeons);
                    visited[i] = false;
                }
            }
            count = Math.max(count, level);
        }
    }
}
