package com.example.inflern.recursive;

import java.util.LinkedList;
import java.util.Queue;

public class BfsTreeEnd {
    Node tree;

    public static void main(String[] args) {
        BfsTreeEnd treeEnd = new BfsTreeEnd();
        treeEnd.tree = new Node(1);
        treeEnd.tree.lt = new Node(2);
        treeEnd.tree.rt = new Node(3);
        treeEnd.tree.lt.lt = new Node(4);
        treeEnd.tree.lt.rt = new Node(5);
        System.out.println(treeEnd.bfs( treeEnd.tree));
    }

    private int bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node cur = queue.poll();
                if(cur.lt == null && cur.rt == null) return level;
                if(cur.lt != null) queue.offer(cur.lt);
                if(cur.rt != null) queue.offer(cur.rt);

            }
            level++;
        }
        return level;
    }
}
