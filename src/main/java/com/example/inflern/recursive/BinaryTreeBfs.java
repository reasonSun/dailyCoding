package com.example.inflern.recursive;


import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBfs {
    Node root;

    public static void main(String[] args) {
        BinaryTreeBfs treeBfs = new BinaryTreeBfs();
        treeBfs.root = new Node(1);
        treeBfs.root.lt = new Node(2);
        treeBfs.root.rt = new Node(3);
        treeBfs.root.lt.lt = new Node(4);
        treeBfs.root.lt.rt = new Node(5);
        treeBfs.root.rt.lt = new Node(6);
        treeBfs.root.rt.rt = new Node(7);
        treeBfs.bfs(treeBfs.root);
    }

    private void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(L +" : ");
            for (int i = 0; i < len; i++) {
                Node cur = queue.poll();
                System.out.print(cur.data+ " ");
                if(cur.lt != null) queue.offer(cur.lt);
                if(cur.rt != null) queue.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }
}
