public class StackLinkedList {

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;
    int size = 0;

    boolean isEmpty(Node head) {
        if (head == null) {
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    }

    void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
        size++;
    }

    int pop() {
        if (isEmpty(head)) {
            return -1;
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    int peek() {
        if (isEmpty(head)) {
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
    
}
