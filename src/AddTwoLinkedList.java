public class AddTwoLinkedList {

    public static void main(String[] args) {
        LinkedList firstNumber = new LinkedList(12);
        LinkedList secondNumber = new LinkedList(132);
        firstNumber.display();
        secondNumber.display();
        LinkedList sum = firstNumber.add(secondNumber);
        sum.display();
    }
}

class LLNode {
    Integer data;
    LLNode next;

    public LLNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    LLNode head;

    public LinkedList(int num) {
        this.head = createNumberList(num);
    }

    public LinkedList(LLNode head) {
        this.head = head;
    }

    public void display() {
        LLNode temp = this.head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public LinkedList add(LinkedList secondNumber) {

        LLNode resultNode = null;
        int sum;
        int carry = 0;

        while(this.head != null || secondNumber.head != null) {
            sum = (this.head != null ? this.head.data : 0 )
                    + (secondNumber.head != null ? secondNumber.head.data : 0 )
                    + carry;
            carry = sum/10;
            sum = sum % 10;

            if(resultNode == null) {
                resultNode = new LLNode(sum);
            } else {
               appendToList(resultNode, sum);
            }
            this.head = this.head != null ? this.head.next : null;
            secondNumber.head = secondNumber.head != null ? secondNumber.head.next : null;
        }
        if(carry > 0) {
            appendToList(resultNode, carry);
        }
        return new LinkedList(resultNode);
    }

    private LLNode createNumberList(int num) {
        LLNode head = null;
        while(num > 0) {
            int tempNum = num%10;
            if(head == null) {
                head = new LLNode(tempNum);
            } else {
                appendToList(head, tempNum);
            }
            num = num/10;
        }
        return head;
    }

    private void appendToList(LLNode headNode, int data) {
        LLNode tempNode = new LLNode(data);
        LLNode temp = headNode;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = tempNode;
    }
}
