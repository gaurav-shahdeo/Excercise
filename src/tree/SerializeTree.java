package tree;

import model.TreeNode;

import static model.TreeNode.display;

public class SerializeTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root = root.createTree();
        display(root);   // display method present in TreeNode

        String serializedTree = serialize(root);
        System.out.println("Serialized Tree: " + serializedTree);

        String[] serializedTreeArray = serializedTree.split(",");
        int[] index = {0};
        TreeNode deserializedRoot = deserialize(serializedTreeArray, index);
        display(deserializedRoot);
    }

    private static String serialize(TreeNode root) {
        String serialized = "";

        if(root != null) {
            String serializedLeft = serialize(root.left);
            String serializedRight = serialize(root.right);
            serialized = root.data + "," + serializedLeft + "," + serializedRight + ",";
        }
        else {
            serialized+="#,";
        }
        return serialized.substring(0, serialized.length() - 1);
    }

    private static TreeNode deserialize(String[] serializedTree, int[] i) {

        //System.out.println("i: " + i[0] + " [0]: " + (i[0]<serializedTree.length ? serializedTree[i[0]]:""));

        if( serializedTree[i[0]].equals("#"))
            return null;

        TreeNode root = new TreeNode(Integer.valueOf( serializedTree[i[0]]));
        i[0] = i[0] + 1;
        root.left = deserialize(serializedTree, i);
        i[0] = i[0] + 1;
        root.right = deserialize(serializedTree, i);

        return root;
    }
}
