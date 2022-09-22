package com.example.inflern.recursive;

public class DfsTreeEnd {
    Node tree;

    //dfs 자식이 있으면 lt, rt 둘다 있어야함
    public static void main(String[] args) {
        DfsTreeEnd treeEnd = new DfsTreeEnd();
        treeEnd.tree = new Node(1);
        treeEnd.tree.lt = new Node(2);
        treeEnd.tree.rt = new Node(3);
        treeEnd.tree.lt.lt = new Node(4);
        treeEnd.tree.lt.rt = new Node(5);
        System.out.println(treeEnd.dfs(0, treeEnd.tree));
    }

    private int dfs(int level, Node root) {
        if (root.lt == null && root.rt == null) {
            return level;
        }else{
            return Math.min(dfs(level+1, root.lt), dfs(level+1, root.rt));
        }
    }
}
