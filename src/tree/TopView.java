package tree;

import model.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class TopView {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root = root.createTree();
        TreeNode.display(root);
        printTopView(root);
    }

    private static void printTopView(TreeNode root) {
        Map<Integer, TreeNode> nodesOnSameHD = new HashMap<>();
        printTopViewUtil(root, 0,nodesOnSameHD);
    }

    private static void printTopViewUtil(TreeNode root, int hd, Map<Integer, TreeNode> nodesOnSameHD) {

        if(root!=null) {
            TreeNode tempNode = nodesOnSameHD.get(hd);
            if(tempNode == null) {
                nodesOnSameHD.put(hd, root);
                System.out.println(root.data);
            }
            printTopViewUtil(root.left, hd - 1, nodesOnSameHD);
            printTopViewUtil(root.right, hd + 1, nodesOnSameHD);
        }
    }
}
