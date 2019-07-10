package tree;

import model.TreeNode;

import java.util.Map;
import java.util.TreeMap;

public class PrintVerticalSum {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root = root.createTree();
        printVerticalSum(root);
    }

    private static void printVerticalSum(TreeNode root) {
        Map<Integer, Integer> recordHD = new TreeMap<>();
        getVerticalSum(root, 0, recordHD);
        displaySum(recordHD);
    }

    private static void displaySum(Map<Integer, Integer> recordHD) {
        for(Map.Entry<Integer, Integer> hdEntry : recordHD.entrySet()) {
            System.out.println(hdEntry.getKey() + " : " + hdEntry.getValue());
        }
    }

    private static void getVerticalSum(TreeNode root, int hd, Map<Integer, Integer> recordHD) {
        if(root != null) {
            Integer verticalNodeSum = recordHD.get(hd);
            if(verticalNodeSum == null) verticalNodeSum = 0;
            verticalNodeSum += root.data;
            recordHD.put(hd, verticalNodeSum);
            getVerticalSum(root.left, hd-1, recordHD);
            getVerticalSum(root.right, hd+1, recordHD);

        }
    }
}



