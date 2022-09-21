package com.example.inflern.recursive;

class Node{
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
public class BinaryTreeDfs {
    Node root;

    public static void main(String[] args) {
        BinaryTreeDfs tree = new BinaryTreeDfs();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.dfs(tree.root);
    }

    private void dfs(Node root) {
        if (root == null) {
            return;
        }else {
            //sout 전위순회
            dfs(root.lt);
            System.out.print(root.data + " ");//sout 중위순회
            dfs(root.rt);
//            System.out.print(root.data + " "); //후위순회
        }
    }
}


