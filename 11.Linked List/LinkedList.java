// LinkedList class

public class LinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;
    int size = 0;

    void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node temp = head;
        Node newNode = new Node(data);
        size++;

        while (index > 1) {
            temp = temp.next;
            index--;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    int removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        } else if (head == tail) {
            Node temp = head;
            head = null;
            tail = null;
            size--;
            return temp.data;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
            size--;
            return temp.data;
        }
    }

    int removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        } else if (head == tail) {
            Node temp = head;
            head = null;
            tail = null;
            size--;
            return temp.data;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            Node lastNode = tail;
            tail = temp;
            temp.next = null;
            size--;
            return lastNode.data;
        }
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
