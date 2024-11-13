public class DeleteNthNodeFromEnd {

    public static LinkedList.Node deleteNthNodeFromEnd(LinkedList.Node head, int n) {
        LinkedList.Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (size < n) {
            return null;
        }
        if (size == n) {
            return head.next;
        }
        temp = head;
        for (int i = 1; i < size - n; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {

        // Create an instance of the LinkedList
        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        list.print(); // Output: 10 20 30 40 50
        list.head = deleteNthNodeFromEnd(list.head, 5);
        list.print(); // Output: 10 20 30 50

    }
}
