package com.example.leetcode;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class SameTree100 {
    TreeNode root;
    public static void main(String[] args) {
        SameTree100 tree1 = new SameTree100();
        tree1.root=new TreeNode(1);
        tree1.root.left = new TreeNode(2);
        tree1.root.right = new TreeNode(3);

        SameTree100 tree2 = new SameTree100();
        tree2.root=new TreeNode(1);
        tree2.root.left = new TreeNode(2);
        tree2.root.right = new TreeNode(3);

        SameTree100 solution = new SameTree100();
        System.out.println(solution.dfs(tree1.root, tree2.root));
    }

    public boolean dfs(TreeNode tree1, TreeNode tree2) {
        if(tree1 == null && tree2 == null) return true;
        if(tree1 == null || tree2 ==null) return false;
        if(tree1.val != tree2.val) return false;
        return dfs(tree1.left, tree2.left) && dfs(tree1.right, tree2.right);
    }
}
