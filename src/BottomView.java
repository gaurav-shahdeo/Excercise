

import model.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class BottomView {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root = root.createTree();
        TreeNode.display(root);
        printBottomView(root);
    }

    private static void printBottomView(TreeNode root) {
        Map<Integer, TreeNode> nodesOnSameHD = new HashMap<>();
        printBottomViewUtil(root, 0, nodesOnSameHD);
    }

    private static void printBottomViewUtil(TreeNode root, int hd, Map<Integer, TreeNode> nodesOnSameHD) {

        if (root != null) {
            printBottomViewUtil(root.left, hd - 1, nodesOnSameHD);
            printBottomViewUtil(root.right, hd + 1, nodesOnSameHD);
            TreeNode tempNode = nodesOnSameHD.get(hd);
            if (tempNode == null) {
                nodesOnSameHD.put(hd, root);
                System.out.println(root.data);
            }
        }
    }
}
