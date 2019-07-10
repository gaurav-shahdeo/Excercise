package model;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int data;
    public TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public TreeNode createTree() {
        this.left = new TreeNode(2);
        this.right = new TreeNode(3);
        this.left.left = new TreeNode(4);
        this.left.right = new TreeNode(5);
        this.left.left.right = new TreeNode(6);
        this.left.left.right.right = new TreeNode(7);

        return this;
    }

    public static void display(TreeNode root){
        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            TreeNode temp = q.poll();
            if(temp != null) {
                System.out.print(temp.data + " ");
                if(temp.left !=null) q.add(temp.left);
                if(temp.right !=null) q.add(temp.right);
                q.add(null);
            } else {
                System.out.println();
            }

        }
    }
}
