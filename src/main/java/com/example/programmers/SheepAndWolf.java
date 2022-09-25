package com.example.programmers;

import java.util.LinkedList;
import java.util.Queue;

class SheepNode{
    int val;
    SheepNode lt, rt;
    int isSheep;

    public SheepNode(int val, int isSheep) {
        this.val = val;
        this.isSheep = isSheep;
        lt = rt = null;
    }
}
public class SheepAndWolf {

    SheepNode root;

    public static void main(String[] args) {
        SheepAndWolf wolf = new SheepAndWolf();
        int[] info = {0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1};
        wolf.root = new SheepNode(0 , 0);
        wolf.root.lt = new SheepNode(1, 0);
        wolf.root.rt = new SheepNode(8, 1);
        wolf.root.lt.lt = new SheepNode(2 ,1);
        wolf.root.lt.rt = new SheepNode(4, 1);
        wolf.root.rt.lt = new SheepNode(7, 0);
        wolf.root.rt.rt = new SheepNode(9,1);
        wolf.root.lt.rt.lt = new SheepNode(3,0);
        wolf.root.lt.rt.rt = new SheepNode(6,1);
        wolf.root.rt.rt.lt = new SheepNode(10,0);
        wolf.root.rt.rt.rt = new SheepNode(11,1);
        wolf.root.lt.rt.rt.lt = new SheepNode(5,1);
        wolf.bfs(wolf.root,info);
    }

    private void bfs(SheepNode root, int[] info) {
        Queue<SheepNode> queue = new LinkedList<>();
        queue.offer(root);
        int sheepCnt = 1, wolfCnt = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                SheepNode cur = queue.poll();

                if (cur.lt != null) {
                    queue.offer(cur.lt);
                    if (info[cur.lt.val] == 0) sheepCnt++;
                    else wolfCnt++;
                }
                if (cur.rt != null) {
                    queue.offer(cur.rt);
                    if (info[cur.rt.val] == 0) sheepCnt++;
                    else wolfCnt++;
                }

                if(sheepCnt <= wolfCnt) System.out.println("stop");
            }
        }
    }
}
