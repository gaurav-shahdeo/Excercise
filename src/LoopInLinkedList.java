import model.Node;


public class LoopInLinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.createList(head);
        head.next.next.next.next.next = head;
        detectLoop(head);
       // print(head);
    }

    private static void print(Node head) {
        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }

    }
    private static void detectLoop(Node head) {

        Node fast = head, slow = head;
        while(fast != null && slow != null) {
            fast = fast.next;
            if(fast == slow) {
                System.out.println("Loop Detected");
                break;
            }
            if(fast == null) return;
            fast = fast.next;
            if(fast == slow) {
                System.out.println("Loop Detected");
                break;
            }
            slow = slow.next;
        }
    }
}
