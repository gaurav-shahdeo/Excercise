import model.Node;


public class LoopInLinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.createList(head); // List is 1 2 3 4 5 6
        head.next.next.next.next.next.next = head.next.next;
        print(head);
        detectLoop(head);
    }

    private static void print(Node head) {
        int i = 0;                  // prints 1 2 3 4 5 6 3 4 5 6 3 4 .... : Last node 6 points to 3 instead of null.
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
            if (i++ > 10) break;
        }
    }

    private static void detectLoop(Node head) {
        Node fast = head, slow = head;
        boolean isLoopExists = false;
        while (fast != null && slow != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                System.out.println("\nLoop Detected");
                isLoopExists = true;
                break;
            }
        }
        System.out.println("Fast and Slow met at : " + fast.data + " " + slow.data); // prints 5

        if (isLoopExists) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            System.out.println("Loop detected at : " + fast.data); // prints 3
        }
    }
}
