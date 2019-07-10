import model.TreeNode;

import java.util.*;


public class PrintVerticalTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root = root.createTree();
        printVertical(root);
    }

    private static void printVertical(TreeNode root) {

        Map<Integer, List<TreeNode>> recordHD = new TreeMap<>();
        verticalTraversal(root, 0, recordHD);
        display(recordHD);
    }

    private static void verticalTraversal(TreeNode root, int hd, Map<Integer, List<TreeNode>> recordHD) {
        if (root != null) {

            List verticalNodes = recordHD.get(hd);
            if (verticalNodes == null) {
                verticalNodes = new LinkedList<>();
            }
            verticalNodes.add(root.data);
            recordHD.put(hd, verticalNodes);

            verticalTraversal(root.left, hd - 1, recordHD);
            verticalTraversal(root.right, hd + 1, recordHD);
        }
    }

    private static void display(Map<Integer, List<TreeNode>> recordHD) {
        for (Map.Entry<Integer, List<TreeNode>> hd : recordHD.entrySet()) {
            System.out.println(hd.getKey() + " : " + hd.getValue());
        }
    }
}

