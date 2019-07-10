package model;

public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public void createList(Node head) {
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
    }
}
