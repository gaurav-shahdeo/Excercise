import model.TreeNode;

public class DistanceBetweenTwoNodesInBT {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root = root.createTree();
        int dist = distanceBetweenNodes(root,3,5);
        System.out.println("Distance is: " + dist);

    }

    private static int distanceBetweenNodes(TreeNode root, int node1, int node2) {
        int dist = 0;
        TreeNode lcaNode = lca(root, node1, node2);
        System.out.println(lcaNode != null ? lcaNode.data : 0);

        return dist;
    }

    private static TreeNode lca(TreeNode root, int node1, int node2) {

        if(root != null) {
            if((root.left!=null && root.left.data == node1 && root.right!= null && root.right.data == node2) ||
                    (root.left!=null && root.left.data == node2 && root.right!= null && root.right.data == node1))
                return root;
            else if ((root.data == node1 && root.left!=null && root.left.data == node2) ||
                    (root.data == node2 && root.left!=null && root.left.data == node1))
                return root;
            else if ((root.data == node1 && root.right!=null && root.right.data == node2) ||
                    (root.data == node2 && root.right!=null && root.right.data == node1))
                return root;
            lca(root.left, node1, node2);
            lca(root.right, node1, node2);
        }
        return null;
    }
}
