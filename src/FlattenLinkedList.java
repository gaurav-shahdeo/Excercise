
public class FlattenLinkedList {
    public static void main(String[] args) {
        TwoWayLinkedList list= new TwoWayLinkedList();
        list.createList();
        FLLNode resultList = list.flattenList();
        list.display(resultList);
    }

}

class TwoWayLinkedList {
    FLLNode head;

    public void createList() {
        this.head = new FLLNode(5);
        this.head.next = new FLLNode(10);
        this.head.next.next = new FLLNode(19);
        this.head.next.next.next = new FLLNode(28);
        this.head.down = new FLLNode(7);
        this.head.down.down = new FLLNode(8);
        this.head.down.down.down = new FLLNode(30);
        this.head.next.down = new FLLNode(20);
        this.head.next.down.down = new FLLNode(50);
    }

    public FLLNode flattenList() {

        FLLNode root = this.head;
        FLLNode right = this.head.next;

        if(root == null || right == null) {
            return root;
        }

        while(root != null || right !=null) {
            root = merge(root, right);
        }

        return root;
    }

    private FLLNode merge(FLLNode root, FLLNode right) {

        FLLNode result = null;

        while(root != null || right != null) {
            if(root == null) {
                result = right;
                right = right.down;
            }
            if(root.data < right.data) {
                result = root;
                root = root.down;
            } else {
                result = right;
                right = right.down;
            }
        }
        return result;
    }


    public void display(FLLNode resultList) {
        while(resultList != null) {
            System.out.print(resultList.data + " ");
            resultList = resultList.next;
        }
        System.out.println();
    }

}

class FLLNode {
    Integer data;
    FLLNode next;
    FLLNode down;

    public FLLNode(int data) {
        this.data = data;
        this.next = null;
        this.down = null;
    }
}
