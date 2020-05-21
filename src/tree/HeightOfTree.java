package tree;

import model.TreeNode;

public class HeightOfTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root = root.createTree();
        //TreeNode.display(root);
        System.out.println(height(root));

    }

    public static int height(TreeNode root) {
        if (root != null) {
            int lHeight = height(root.left);
            int rHeight = height(root.right);
            if (lHeight > rHeight) {
                return lHeight + 1;
            } else {
                return rHeight + 1;
            }
        }
        return 0;
    }
}
